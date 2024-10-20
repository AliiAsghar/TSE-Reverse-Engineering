package defpackage;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public afvz(acyu acyuVar) {
        this.i = acyuVar.i("verifier_info_enabled", false);
        this.b = acyuVar.i("verified_sms_token_enabled", true);
        this.e = acyuVar.h("bot_info_request_version", "1.5");
        this.a = acyuVar.h("debug_business_info_domain", "");
        this.j = acyuVar.h("nonstandard_rbm_phone_numbers_regex", "^(tel:)?\\+[0-9]{7,15}$");
        this.l = acyuVar.g("client_timeout_sec", 120L);
        this.d = acyuVar.g("client_ringing_period_sec", 30L);
        this.g = acyuVar.g("immediate_retry_backoff_sec", 2L);
        this.f = acyuVar.g("immediate_retry_backoff_rate_sec", 2L);
        this.k = acyuVar.g("max_immediate_retries", 5L);
        this.c = acyuVar.g("server_retry_backoff_sec", 300L);
        this.h = acyuVar.g("server_retry_backoff_rate", 3L);
    }

    public afvz(View view) {
        this.a = view;
        View findViewById = view.findViewById(R.id.proxy_screen_container);
        findViewById.getClass();
        this.b = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.proxy_screen_header);
        findViewById2.getClass();
        this.c = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.proxy_screen_search_icon);
        findViewById3.getClass();
        this.d = (AppCompatImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.proxy_screen_clear_icon);
        findViewById4.getClass();
        this.e = (AppCompatImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.proxy_screen_search_bar_wrapper);
        findViewById5.getClass();
        this.f = (ViewGroup) findViewById5;
        View findViewById6 = view.findViewById(R.id.proxy_screen_search_bar);
        findViewById6.getClass();
        this.g = (EditText) findViewById6;
        View findViewById7 = view.findViewById(R.id.proxy_screen_button);
        findViewById7.getClass();
        this.h = (ComposeView) findViewById7;
        View findViewById8 = view.findViewById(R.id.proxy_screen_tabs);
        findViewById8.getClass();
        this.i = (TabLayout) findViewById8;
        View findViewById9 = view.findViewById(R.id.proxy_screen_tabs_bottom_border);
        findViewById9.getClass();
        this.j = findViewById9;
        View findViewById10 = view.findViewById(R.id.proxy_screen_screens_container);
        findViewById10.getClass();
        this.k = (FrameLayout) findViewById10;
        View findViewById11 = view.findViewById(R.id.search_rows_recycler_view);
        findViewById11.getClass();
        this.l = (RecyclerView) findViewById11;
    }
}
