package bean;

import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Chronometer extends JLabel implements Serializable,Runnable
{
	private long begin,timeByProrroga,prorroga;
	private Thread thread;
	private boolean inPause;
	
	public Chronometer()
	{
		super();
		
		restart();
		this.setForeground(Color.black);
		this.setBackground(Color.white);
		this.inPause = false;
		thread = new Thread(this);
		thread.start();
	}

	public Chronometer(Color foreColor,Color backColor)
	{
		super();
		
		restart();
		this.setForeground(foreColor);
		this.setBackground(backColor);
		this.inPause = false;
		thread = new Thread(this);
		thread.start();
	}
	
	public void restart()
	{
		this.begin = new Date().getTime();
		this.prorroga = 0;
		this.timeByProrroga = 0;
		this.inPause = false;
	}
	
	public void pause()
	{
		if(this.inPause)
		{
			this.inPause = false;
			this.prorroga += new Date().getTime() - this.timeByProrroga;
		}
		else
		{
			this.inPause = true;
			
			this.timeByProrroga = new Date().getTime();
		}
	}
	
	public long getBegin()
	{
		return begin;
	}
	
	private long getTimeByPause()
	{
		return this.prorroga + (this.inPause ? new Date().getTime() - this.timeByProrroga : 0);
	}
	
	public long getTime()
	{
		return new Date().getTime() - begin - getTimeByPause();
	}

	@Override
	public void run()
	{
		for(;;)
		{
			this.setText(
					String.valueOf(
							new SimpleDateFormat("mm:ss").format( getTime() )));
		
		    try
		    {
		    	Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		}
				
	}
	
}
