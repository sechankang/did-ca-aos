/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.ca.ui.vc;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.omnione.did.ca.R;


public class AddVcListItemView extends LinearLayout {
    TextView textView;
    TextView textView2;
    ImageView imageView;
    ImageView imageView2;

    public AddVcListItemView(Context context) {
        super(context);

        init(context);
    }

    public AddVcListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.add_vc_list_item, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

    }

    public void setTitle(String title) {
        textView.setText(title);
    }

    public void setDescription(String description) {
        textView2.setText(description);
    }

    public void setImage(String img){
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(Base64.decode(img.split(",")[1], Base64.DEFAULT), 0, Base64.decode(img.split(",")[1], Base64.DEFAULT).length));
    }
    public void setIcon(String img){
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(Base64.decode(img.split(",")[1], Base64.DEFAULT), 0, Base64.decode(img.split(",")[1], Base64.DEFAULT).length));
    }
}
