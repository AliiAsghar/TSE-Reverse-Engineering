package com.google.android.apps.messaging.conversation.draft.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.afcp;
import defpackage.alwo;
import defpackage.hwr;
import defpackage.imv;
import defpackage.imz;
import defpackage.lga;
import defpackage.myn;
import defpackage.myz;
import defpackage.tqj;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class GalleryContent implements Parcelable, imv, myn {
    public static final alwo o = alwo.o("BugleGallery");
    public final AtomicReference p = new AtomicReference();

    public static imz n() {
        imz imzVar = new imz(null);
        imzVar.e(-1L);
        imzVar.f(tqj.STANDARD);
        imzVar.f = null;
        imzVar.c = null;
        imzVar.b = null;
        imzVar.d = (byte) (imzVar.d | 4);
        imzVar.e = 1;
        return imzVar;
    }

    @Override // defpackage.mxf
    public abstract Uri b();

    @Override // defpackage.myn
    public abstract Uri c();

    public abstract tqj f();

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return hwr.m(this);
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return (myz) this.p.get();
    }

    @Override // defpackage.myn
    public abstract Optional h();

    @Override // defpackage.myt
    public abstract String i();

    @Override // defpackage.myn
    public abstract int m();

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
