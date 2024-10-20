package com.google.android.apps.messaging.ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import defpackage.ajgi;
import defpackage.armf;
import defpackage.ev;
import defpackage.ivs;
import defpackage.mbl;
import defpackage.rei;
import defpackage.xyl;
import defpackage.yhx;
import defpackage.yjy;
import defpackage.yug;
import defpackage.zgg;
import defpackage.zgh;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClassZeroActivity extends zgh {
    public armf n;
    public armf o;
    public armf p;
    public rei s;
    private ContentValues x = null;
    public boolean q = false;
    private long y = 0;
    public ev r = null;
    private ArrayList z = null;
    private final Handler A = new zgg(this);
    private final DialogInterface.OnClickListener B = new ivs(this, 9);
    private final DialogInterface.OnClickListener C = new ivs(this, 10);

    private final void D(ContentValues contentValues) {
        this.x = contentValues;
        String asString = contentValues.getAsString("body");
        ajgi ajgiVar = new ajgi(this);
        ajgiVar.n(asString);
        ajgiVar.t(R.string.save, this.C);
        ajgiVar.o(android.R.string.cancel, this.B);
        ajgiVar.x(R.string.class_0_message_activity);
        ajgiVar.j(false);
        this.r = ajgiVar.a();
        this.y = SystemClock.uptimeMillis() + 300000;
        ((mbl) this.n.b()).e("Bugle.Sms.ClassZero.Class.ActivityCreated", z());
    }

    private final boolean E(Intent intent) {
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("message_values");
        if (TextUtils.isEmpty(contentValues.getAsString("body"))) {
            if (this.z.isEmpty()) {
                finish();
                return false;
            }
            return false;
        }
        this.z.add(contentValues);
        return true;
    }

    public final void A() {
        if (!this.z.isEmpty()) {
            this.z.remove(0);
        }
        if (this.z.isEmpty()) {
            finish();
        } else {
            D((ContentValues) this.z.get(0));
        }
    }

    public final void C() {
        this.x.put("read", Integer.valueOf(this.q ? 1 : 0));
        this.s.a(this.x).t();
        ((mbl) this.n.b()).e("Bugle.Sms.ClassZero.Class.MessageSaved", z());
    }

    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (yhx.a) {
        }
        if (this.z == null) {
            this.z = new ArrayList();
        }
        if (E(getIntent())) {
            xyl.a(1, this.z.size());
            if (this.z.size() == 1) {
                D((ContentValues) this.z.get(0));
            }
            if (bundle != null) {
                this.y = bundle.getLong("timer_fire", this.y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        E(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("timer_fire", this.y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStart() {
        super.onStart();
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.y;
        if (j <= uptimeMillis) {
            this.A.sendEmptyMessage(1);
        } else {
            this.A.sendEmptyMessageAtTime(1, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.A.removeMessages(1);
    }

    public final int z() {
        Integer num;
        ContentValues contentValues = this.x;
        if (contentValues != null) {
            num = contentValues.getAsInteger("sub_id");
        } else {
            num = null;
        }
        if (num == null) {
            num = -1;
        }
        return ((Integer) Optional.ofNullable(((yjy) this.o.b()).h(num.intValue()).x()).map(new yug(18)).orElse(0)).intValue();
    }
}
