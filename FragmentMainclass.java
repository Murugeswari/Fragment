package com.example.fragmenttest;


import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity<view, View> extends Activity {

    private static final android.view.View View = null;

    	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            setContentView(R.layout.activity_main);
			        }
				    
				        @TargetApi(Build.VERSION_CODES.HONEYCOMB) public void selectFrag(View view)
					    {
					        	Fragment fr;
							    	
								    	if(View==findViewById(R.id.button2))
									    			{
												    		fr=new FragmentTwo();
														    			}
																	    	else
																		    	{
																			    		fr=new Fragmentone();
																					    	}
																						    	
																							    	android.app.FragmentManager fm = getFragmentManager();
																									     FragmentTransaction fragmentTransaction = fm.beginTransaction();
																									     	     fragmentTransaction.replace(R.id.fragment1, fr);
																										     	     fragmentTransaction.commit();
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
														
