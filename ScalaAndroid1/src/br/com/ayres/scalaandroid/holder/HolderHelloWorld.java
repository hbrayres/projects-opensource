/*
 * Copyright (C) 2015 Samsung Electronics Co., Ltd. All rights reserved.
 *
 * Mobile Communication Division,
 * Digital Media & Communications Business, Samsung Electronics Co., Ltd.
 *
 * This software and its documentation are confidential and proprietary
 * information of Samsung Electronics Co., Ltd.  No part of the software and
 * documents may be copied, reproduced, transmitted, translated, or reduced to
 * any electronic medium or machine-readable form without the prior written
 * consent of Samsung Electronics.
 *
 * Samsung Electronics makes no representations with respect to the contents,
 * and assumes no responsibility for any errors that might appear in the
 * software and documents. This publication and the contents hereof are subject
 * to change without notice.
 */
package br.com.ayres.scalaandroid.holder;

import android.app.Activity;
import android.widget.TextView;
import br.com.ayres.scalaandroid.R;

public class HolderHelloWorld {

    private TextView tvHelloWorld;

    private Activity mView;
    
    public HolderHelloWorld(final Activity view) {
	mView = view;
	initialize();
    }
    
    private void initialize() {
	tvHelloWorld = (TextView) mView.findViewById(R.id.tv_hello_world); 
    }
    
    public void putText(final String text) {
	tvHelloWorld.setText(text);
    }
    
    public TextView getTvHelloWorld() {
        return tvHelloWorld;
    }

    public void setTvHelloWorld(TextView tvHelloWorld) {
        this.tvHelloWorld = tvHelloWorld;
    }
    
}
