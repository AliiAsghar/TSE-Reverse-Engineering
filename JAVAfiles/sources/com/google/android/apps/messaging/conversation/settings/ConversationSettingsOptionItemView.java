package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.akvv;
import defpackage.aohs;
import defpackage.gqg;
import defpackage.iew;
import defpackage.iyw;
import defpackage.rsg;
import defpackage.trz;
import defpackage.xbf;
import defpackage.xxe;
import defpackage.yhw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSettingsOptionItemView extends iyw {
    public TextView a;
    public TextView b;
    public SwitchCompat c;
    public rsg d;
    public gqg e;
    public aohs f;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akvv {
        public final rsg a;

        public a(rsg rsgVar) {
            this.a = rsgVar;
        }
    }

    public ConversationSettingsOptionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (SwitchCompat) findViewById(R.id.switch_button);
        gqg gqgVar = this.e;
        ?? r1 = gqgVar.c;
        Context context = getContext();
        yhw yhwVar = (yhw) r1.b();
        yhwVar.getClass();
        xbf xbfVar = (xbf) gqgVar.d.b();
        xbfVar.getClass();
        xxe xxeVar = (xxe) gqgVar.a.b();
        xxeVar.getClass();
        trz trzVar = (trz) gqgVar.b.b();
        trzVar.getClass();
        ((iew) gqgVar.e.b()).getClass();
        context.getClass();
        rsg rsgVar = new rsg(yhwVar, xbfVar, xxeVar, trzVar, context);
        this.d = rsgVar;
        this.f.s(this, new a(rsgVar));
    }
}
