package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iog implements inl {
    public final mci a;
    public final zpt b;
    public final ydf c;
    public final iod d;
    public final abbu e;
    public AttachmentQueueState f;
    public aaqq g;
    public aapf h;
    public inn i;
    public inq j;
    public ContentGridView k;
    public final zme l;
    public final lxs m;
    public final aqws n;
    public final abac o;
    public final ifb p;
    public final ifb q;
    private final mcm r;

    public iog(ifb ifbVar, mci mciVar, abac abacVar, zme zmeVar, mcm mcmVar, zpt zptVar, ydf ydfVar, iod iodVar, aqws aqwsVar, ifb ifbVar2, abbu abbuVar, lxs lxsVar) {
        this.p = ifbVar;
        this.a = mciVar;
        this.o = abacVar;
        this.l = zmeVar;
        this.r = mcmVar;
        this.b = zptVar;
        this.c = ydfVar;
        this.d = iodVar;
        this.n = aqwsVar;
        this.q = ifbVar2;
        this.e = abbuVar;
        this.m = lxsVar;
    }

    @Override // defpackage.inl
    public final cg a() {
        return this.d;
    }

    @Override // defpackage.inl
    public final void b() {
        rsr rsrVar = (rsr) g().C().a();
        amqh amqhVar = amqh.ALL;
        amqi amqiVar = amqi.COLLAPSED;
        rsrVar.k();
        this.m.b().toMillis();
        this.r.b(amqhVar, amqiVar, amqd.UNKNOWN_CLOSING_SOURCE);
        h().E().c();
    }

    @Override // defpackage.inl
    public final void c(Bundle bundle) {
        if (bundle.getBoolean("open_location_chooser")) {
            h().E().k(amqe.EXPAND, ((rsr) g().C().a()).n());
        }
        this.m.e();
        rre C = g().C();
        if (C != null && C.g()) {
            mcm mcmVar = this.r;
            amqh amqhVar = amqh.ALL;
            amqi amqiVar = amqi.COLLAPSED;
            ((rsr) C.a()).k();
            mcmVar.d(amqhVar, amqiVar, amqf.UNKNOWN_OPENING_STATE, amqe.PLUS_BUTTON);
        }
    }

    @Override // defpackage.inl
    public final void d(inn innVar) {
        this.i = innVar;
    }

    @Override // defpackage.inl
    public final void e(inq inqVar) {
        this.j = inqVar;
    }

    @Override // defpackage.inl
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Deprecated
    public final aabz g() {
        eoz eozVar;
        cg cgVar = this.d.E;
        if (cgVar != null && (eozVar = cgVar.E) != null) {
            return (aabz) ((akkh) eozVar).E();
        }
        throw new IllegalStateException("Cannot find ConversationInputHost in fragment hierarchy!");
    }

    public final Compose2oFragment h() {
        Compose2oFragment compose2oFragment = (Compose2oFragment) this.d.G().d(R.id.c2o_fragment);
        compose2oFragment.getClass();
        return compose2oFragment;
    }

    public final void i(Consumer consumer) {
        if (this.h != null) {
            for (int i = 0; i < this.h.a(); i++) {
                consumer.q(this.h.b(i));
            }
        }
    }

    public final void j(BiConsumer biConsumer, Object obj) {
        if (this.h != null) {
            for (int i = 0; i < this.h.a(); i++) {
                biConsumer.accept(this.h.b(i), obj);
            }
        }
    }

    @Override // defpackage.zqe
    public final boolean n() {
        aapf aapfVar = this.h;
        if (aapfVar != null) {
            for (aaqd aaqdVar : aapfVar.a) {
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.zqf
    public final void v() {
        throw null;
    }
}
