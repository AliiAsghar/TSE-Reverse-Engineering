package com.google.android.apps.messaging.blockandreportspam.ui.dialog;

import android.os.Parcelable;
import defpackage.akbp;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alog;
import defpackage.alsx;
import defpackage.amfe;
import defpackage.andi;
import defpackage.anen;
import defpackage.apxx;
import defpackage.armf;
import defpackage.ezr;
import defpackage.haw;
import defpackage.igs;
import defpackage.igu;
import defpackage.igv;
import defpackage.igw;
import defpackage.ikd;
import defpackage.ruy;
import defpackage.xxl;
import defpackage.xxm;
import defpackage.yyz;
import j$.util.Optional;
import java.util.Collection;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BlockAndReportSpamCallbacks {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final anen i;
    public Supplier m = null;
    public final akbp j = new igs(this);
    public final akbp k = new igu(this);
    public final akbp l = new igv(this);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class ParticipantBlockAndSpamStatus implements Parcelable {
        public abstract int a();

        public abstract String b();

        public abstract boolean c();

        public abstract boolean d();
    }

    public BlockAndReportSpamCallbacks(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, anen anenVar) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
        this.g = armfVar7;
        this.h = armfVar8;
        this.i = anenVar;
    }

    public final alog a() {
        Object obj;
        Supplier supplier = this.m;
        if (supplier == null) {
            int i = alog.d;
            return alsx.a;
        }
        obj = supplier.get();
        return alog.n((Collection) obj);
    }

    public final akul b(igw igwVar, int i, int i2, int i3) {
        Boolean bool;
        amfe amfeVar;
        yyz yyzVar = (yyz) this.b.b();
        String str = igwVar.c;
        xxl b = xxm.b();
        b.d = ruy.b(str);
        Boolean bool2 = true;
        if (igwVar.e) {
            bool = bool2;
        } else {
            bool = null;
        }
        b.a = bool;
        if (!igwVar.f) {
            bool2 = null;
        }
        b.b = bool2;
        if (igwVar.e) {
            amfeVar = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
        } else {
            amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
        }
        b.g = amfeVar;
        b.c(i);
        b.b(i2);
        b.i = i3;
        return yyzVar.e(b.a().a()).h(new ezr(11), andi.a);
    }

    public final akul c(igw igwVar) {
        albo.T(((Optional) ((apxx) this.c).a).isPresent());
        byte[] bArr = null;
        return aktp.ai(new haw(this, igwVar, 3, bArr), this.i).i(new ikd(this, igwVar, 1, bArr), this.i);
    }
}
