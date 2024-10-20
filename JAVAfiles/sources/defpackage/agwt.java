package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwt extends oo {
    public final CustomImageView s;
    public final agwr t;

    public agwt(ViewGroup viewGroup, int i, int i2, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view_holder, viewGroup, false));
        CustomImageView customImageView = (CustomImageView) this.a.findViewById(R.id.image_view);
        this.s = customImageView;
        customImageView.setOnClickListener(onClickListener);
        customImageView.setOnLongClickListener(onLongClickListener);
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        this.t = null;
    }
}
