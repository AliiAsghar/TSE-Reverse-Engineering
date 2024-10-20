package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afim extends oo {
    public static final /* synthetic */ int u = 0;
    public final View s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afim(aaaz aaazVar, View view, AsyncImageView asyncImageView) {
        super(view);
        this.t = aaazVar;
        this.s = asyncImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afim(afin afinVar, View view) {
        super(view);
        this.t = afinVar;
        View findViewById = view.findViewById(R.id.select_media_request_permission_button);
        findViewById.getClass();
        this.s = (TextView) findViewById;
    }
}
