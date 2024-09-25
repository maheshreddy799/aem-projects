package com.bhasaka.newsportal.core.service.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhasaka.newsportal.core.service.ProfileInfoService;
@Component(immediate = true, enabled = true, name = "Profile Info Service", service = ProfileInfoService.class)
public class ProfileInfoServiceImpl implements ProfileInfoService{

	
	  private static final Logger LOG = LoggerFactory.getLogger( ProfileInfoServiceImpl.class);
		
	   @Activate
	   protected void activate() {
		
		 LOG.info("activate method is executed");  
	   }
	   
	   @Deactivate
	   protected void deactivate() {
		   LOG.info("deactivate method is executed");  
	   }
 
      @Modified
      protected void update() {
   	   LOG.info("update method is executed");  
	   }
	  @Override
	  public String getProfileById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
