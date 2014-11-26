package cn.edu.gdmec.c07131006.propertanimationdemo;

import android.support.v7.app.ActionBarActivity;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	TextView mytv;
	Button btnalpha, btntranslate, btnscale, btnrotate, alli;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mytv = (TextView) findViewById(R.id.textView1);
		btnalpha = (Button) findViewById(R.id.button1);
		btntranslate = (Button) findViewById(R.id.button2);
		btnscale = (Button) findViewById(R.id.button3);
		btnrotate = (Button) findViewById(R.id.button4);
		alli = (Button) findViewById(R.id.button5);
		btnalpha.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Animator animator = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.alpha_animator);
				animator.setTarget(mytv);
				animator.start();
			}

		});
		btntranslate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Animator animator = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.translate_animator);
				animator.setTarget(mytv);
				animator.start();
			}

		});
		btnscale.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Animator animator = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.scale_animator);
				animator.setTarget(mytv);
				animator.start();
			}

		});
		btnrotate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Animator animator = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.rotate_animator);
				animator.setTarget(mytv);
				animator.start();
			}

		});
		alli.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				AnimatorSet set = new AnimatorSet();
				Animator alpha = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.alpha_animator);
				Animator translate = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.translate_animator);
				Animator scale = AnimatorInflater.loadAnimator(
						MainActivity.this, R.animator.scale_animator);
				
				set.play(alpha).after(translate).with(scale);
				set.setTarget(mytv);
				set.start();
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
