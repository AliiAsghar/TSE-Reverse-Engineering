package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.aafa;
import defpackage.aamq;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.apwt;
import defpackage.aqjn;
import defpackage.armd;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arrn;
import defpackage.arro;
import defpackage.arul;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.d;
import defpackage.qjh;
import defpackage.xze;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoadRepliesReceiver extends aamq {
    public static final xze a = xze.g("BugleReplies", "LoadRepliesReceiver");
    public armf b;
    public armf c;
    public apwt d;
    public armf e;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.b;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("LoadRepliesReceiver receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        akul c;
        context.getClass();
        intent.getClass();
        if (d.F(intent.getAction(), "com.google.android.apps.messaging.load_replies")) {
            List as = aqjn.as(arrn.g(arrn.k(arrn.h(armd.h(new BufferedReader(new InputStreamReader(new FileInputStream((File) LoadMessagesReceiver.c.a(intent, context, "single_conversation_replies.csv")), arul.a), 8192)), ((Number) LoadMessagesReceiver.b.a(intent)).intValue()), ((Number) LoadMessagesReceiver.a.a(intent)).intValue())));
            a.o("Number of lines: " + as.size());
            Iterator it = as.iterator();
            armf armfVar = this.c;
            if (armfVar == null) {
                arro.b("backgroundScope");
                armfVar = null;
            }
            Object b = armfVar.b();
            b.getClass();
            c = qjh.c((arwe) b, arpj.a, arwf.a, new aafa(this, it, (arpe) null, 8));
            q("LoadReplies", c);
            return;
        }
        a.o("Skipping the import, the action " + intent.getAction() + " != com.google.android.apps.messaging.load_replies");
    }
}
