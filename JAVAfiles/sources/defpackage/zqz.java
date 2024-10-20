package defpackage;

import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqz {
    public final abdc a;
    public final zra b;
    public final zqx c;
    public final abcz d;
    public final xnv e;
    public final uvi f;
    public Optional g;
    public boolean h;
    public final armf i;
    public final zrs j;
    private final Optional k;
    private final armf l;

    public zqz(abdc abdcVar, zqx zqxVar, xnv xnvVar, zrs zrsVar, uvi uviVar, zra zraVar, Optional optional, armf armfVar, armf armfVar2) {
        zqy zqyVar = new zqy(this, 0);
        this.d = zqyVar;
        this.g = Optional.empty();
        this.h = false;
        this.a = abdcVar;
        this.c = zqxVar;
        this.e = xnvVar;
        this.j = zrsVar;
        this.f = uviVar;
        this.b = zraVar;
        this.i = armfVar;
        abdcVar.d(zqyVar);
        this.k = optional;
        this.l = armfVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ins insVar) {
        zqm zqmVar;
        zqm zqmVar2;
        zqm zqmVar3;
        zqm zqmVar4;
        int f;
        int d;
        zra zraVar = this.b;
        zri zriVar = ((zrb) zraVar).c;
        zqu zquVar = zriVar.g;
        ImageView imageView = zquVar.e;
        zqo zqoVar = zquVar.g;
        zqo zqoVar2 = zquVar.h;
        zqo c = zraVar.c();
        zqo zqoVar3 = zriVar.g.j;
        if (imageView != null && yig.b() && this.k.isPresent()) {
            int length = this.b.d().length();
            if (((opm) this.l.b()).a() && !((Boolean) yig.ao.e()).booleanValue()) {
                if (insVar == ins.MAGIC_COMPOSE) {
                    f = ((jcf) this.k.get()).g();
                } else {
                    f = ((jcf) this.k.get()).i();
                }
            } else if (insVar == ins.MAGIC_COMPOSE) {
                if (length > 0) {
                    f = ((jcf) this.k.get()).g();
                } else {
                    f = ((jcf) this.k.get()).d();
                }
            } else if (length > 0) {
                f = ((jcf) this.k.get()).i();
            } else {
                f = ((jcf) this.k.get()).f();
            }
            imageView.setTag(((jcf) this.k.get()).c(), Integer.valueOf(f));
            imageView.setImageDrawable(imageView.getContext().getDrawable(f));
            if (insVar == ins.MAGIC_COMPOSE) {
                d = ahnz.d(imageView, R.attr.colorPrimaryBrandIcon);
            } else {
                d = ahnz.d(imageView, R.attr.colorInactiveComposeIcon);
            }
            imageView.setColorFilter(d);
        }
        if (zqoVar2 != null) {
            if (insVar == ins.CAMERA_GALLERY) {
                zqmVar4 = zqm.OPEN;
            } else {
                zqmVar4 = zqm.INACTIVE;
            }
            zqoVar2.b(zqmVar4);
        }
        if (c != null) {
            if (insVar == ins.EMOTIVE) {
                zqmVar3 = zqm.OPEN;
            } else {
                zqmVar3 = zqm.INACTIVE;
            }
            c.b(zqmVar3);
        }
        if (zqoVar != null) {
            if (insVar == ins.C2O) {
                zqmVar2 = zqm.OPEN;
            } else {
                zqmVar2 = zqm.INACTIVE;
            }
            zqoVar.b(zqmVar2);
        }
        if (zqoVar3 != null) {
            if (insVar == ins.VOICE) {
                zqmVar = zqm.OPEN;
            } else {
                zqmVar = zqm.INACTIVE;
            }
            zqoVar3.b(zqmVar);
        }
    }
}
