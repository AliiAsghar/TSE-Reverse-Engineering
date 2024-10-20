package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iol implements inl {
    public final mci a;
    public final zpt b;
    public final ydf c;
    public AttachmentQueueState d;
    public aaqd e;
    public inq f;
    public final lxs g;
    public final abac h;
    public final ifb i;
    public final ifb j;
    private final cg k;
    private final mcm l;

    public iol(ifb ifbVar, mci mciVar, abac abacVar, zpt zptVar, ydf ydfVar, cg cgVar, ifb ifbVar2, mcm mcmVar, lxs lxsVar) {
        this.i = ifbVar;
        this.a = mciVar;
        this.h = abacVar;
        this.b = zptVar;
        this.c = ydfVar;
        this.k = cgVar;
        this.j = ifbVar2;
        this.l = mcmVar;
        this.g = lxsVar;
    }

    @Override // defpackage.inl
    public final cg a() {
        return this.k;
    }

    @Override // defpackage.inl
    public final void b() {
        rsr rsrVar = (rsr) g().C().a();
        amqh amqhVar = amqh.CAMERA_GALLERY;
        amqi amqiVar = amqi.COLLAPSED;
        rsrVar.k();
        this.g.b().toMillis();
        this.l.b(amqhVar, amqiVar, amqd.UNKNOWN_CLOSING_SOURCE);
        h().E().c();
    }

    @Override // defpackage.inl
    public final void c(Bundle bundle) {
        this.g.e();
        rre C = g().C();
        if (C != null && C.g()) {
            mcm mcmVar = this.l;
            amqh amqhVar = amqh.CAMERA_GALLERY;
            amqi amqiVar = amqi.COLLAPSED;
            ((rsr) C.a()).k();
            mcmVar.d(amqhVar, amqiVar, amqf.UNKNOWN_OPENING_STATE, amqe.CAMERA_GALLERY_BUTTON);
        }
    }

    @Override // defpackage.inl
    public final void e(inq inqVar) {
        this.f = inqVar;
    }

    @Override // defpackage.inl
    public final /* synthetic */ boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final aabz g() {
        eoz eozVar;
        xyp.j();
        cg cgVar = this.k.E;
        if (cgVar != null && (eozVar = cgVar.E) != null) {
            return (aabz) ((akkh) eozVar).E();
        }
        throw new IllegalStateException("Cannot find ConversationInputHost in fragment hierarchy.");
    }

    public final Compose2oFragment h() {
        Compose2oFragment compose2oFragment = (Compose2oFragment) this.k.G().d(R.id.c2o_fragment);
        compose2oFragment.getClass();
        return compose2oFragment;
    }

    @Override // defpackage.zqe
    public final boolean n() {
        return false;
    }

    @Override // defpackage.zqf
    public final void v() {
        throw null;
    }

    @Override // defpackage.inl
    public final /* synthetic */ void d(inn innVar) {
    }
}
