package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.aamc;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arro;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.d;
import defpackage.ikp;
import defpackage.qjh;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugContactsSyncReceiver extends aamc {
    public static final xze a = xze.g("BugleContacts", "ContactsSyncReceiver");
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.b;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("ContactsSyncReceiver Receive broadcast");
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
        if (!d.F(intent.getAction(), "com.google.android.apps.messaging.contacts_sync")) {
            a.o("Skipping the import, the action " + intent.getAction() + " != ACTION_CONTACTS_SYNC");
            return;
        }
        a.o("Forcing a contacts import to Bugle DB");
        armf armfVar = this.d;
        if (armfVar == null) {
            arro.b("backgroundScope");
            armfVar = null;
        }
        Object b = armfVar.b();
        b.getClass();
        c = qjh.c((arwe) b, arpj.a, arwf.a, new ikp(this, (arpe) null, 10));
        q("DebugContactsSync", c);
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    public final armf f() {
        armf armfVar = this.g;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("contactsSyncDataService");
        return null;
    }

    public final armf g() {
        armf armfVar = this.e;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("settingsStore");
        return null;
    }
}
