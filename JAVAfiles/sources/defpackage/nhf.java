package defpackage;

import android.os.Bundle;
import defpackage.iqk;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhf implements akvz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [inn, java.lang.Object] */
    @Override // defpackage.akvz
    public final akwa a(akvv akvvVar) {
        jus jusVar;
        nhm nhmVar;
        ngx ngxVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    nhh nhhVar = (nhh) this.a;
                    nhd nhdVar = (nhd) akvvVar;
                    if (nhhVar.b.az() && ((ngxVar = nhhVar.g) == null || nhdVar.b.equals(ngxVar))) {
                        nhm nhmVar2 = nhhVar.f;
                        if (nhmVar2 == null) {
                            nhmVar2 = nhhVar.a(nhdVar.b);
                        }
                        nhmVar2.e(nhdVar.a);
                        if (nhhVar.h) {
                            nhmVar2.f();
                            nhhVar.h = false;
                        }
                    }
                    return akwa.a;
                }
                ngx ngxVar2 = ((nhc) akvvVar).a;
                nhh nhhVar2 = (nhh) this.a;
                if (ngxVar2.equals(nhhVar2.g) && (nhmVar = nhhVar2.f) != null && nhmVar.g()) {
                    nhhVar2.h = true;
                    nhhVar2.f.c();
                }
                return akwa.a;
            }
            iqk iqkVar = (iqk) akvvVar;
            iqkVar.getClass();
            boolean z = iqkVar instanceof iqk.a;
            Object obj = this.a;
            if (z) {
                ((hgj) ((iql) obj).b).a.r(ins.CAMERA_GALLERY, true, false);
            } else if (iqkVar instanceof iqk.b) {
                ((iqj) ((qdq) ((iql) obj).c).a).c(((iqk.b) iqkVar).a);
            } else if (iqkVar instanceof iqk.c) {
                ((iqe) ((iql) obj).d).b.c(((iqk.c) iqkVar).a);
            } else if (iqkVar instanceof iqk.d) {
                Object obj2 = ((iql) obj).f;
                agek agekVar = ((iqk.d) iqkVar).a;
                ins insVar = ins.EMOTIVE;
                Bundle bundle = new Bundle();
                if (agekVar != agek.c && agekVar != agek.f) {
                    Objects.toString(agekVar);
                    throw new IllegalArgumentException("Unsupported screen category ".concat(agekVar.toString()));
                }
                ?? r5 = ((hgj) obj2).a;
                bundle.putInt("initial_screen", agekVar.ordinal());
                r5.s(insVar, true, false, bundle);
            } else if (iqkVar instanceof iqk.e) {
                ((iqj) ((qdq) ((iql) obj).e).a).c(((iqk.e) iqkVar).a);
            } else if (iqkVar instanceof iqk.f) {
                aktp.L(new lzd(), ((iqk.f) iqkVar).a);
            } else {
                throw new armm();
            }
            Object obj3 = ((iql) obj).a;
            if (z) {
                jusVar = jul.a;
            } else if (iqkVar instanceof iqk.b) {
                jusVar = juj.a;
            } else if (iqkVar instanceof iqk.c) {
                jusVar = juk.a;
            } else if (iqkVar instanceof iqk.d) {
                iqk.d dVar = (iqk.d) iqkVar;
                int ordinal = dVar.a.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        jusVar = jur.a;
                    } else {
                        agek agekVar2 = dVar.a;
                        Objects.toString(agekVar2);
                        throw new IllegalStateException("GifStickers with category ".concat(agekVar2.toString()));
                    }
                } else {
                    jusVar = jum.a;
                }
            } else if (iqkVar instanceof iqk.e) {
                jusVar = jun.a;
            } else if (iqkVar instanceof iqk.f) {
                jusVar = jup.a;
            } else {
                throw new armm();
            }
            ((jgq) obj3).c(jusVar);
            return akwa.a;
        }
        nhh nhhVar3 = (nhh) this.a;
        ngy ngyVar = (ngy) akvvVar;
        if (!nhhVar3.e.hasSystemFeature("android.hardware.audio.output")) {
            if (nhhVar3.e.hasSystemFeature("android.hardware.type.watch")) {
                alwl alwlVar = (alwl) nhh.a.g();
                alwlVar.X(ydl.M, "AudioAttachmentController");
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 139, "AudioAttachmentController.java")).q("Watch does not have built in speaker.");
                lga.T(ngyVar.a);
                return akwa.a;
            }
            alwl alwlVar2 = (alwl) nhh.a.g();
            alwlVar2.X(ydl.M, "AudioAttachmentController");
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 148, "AudioAttachmentController.java")).q("Phone does not have built in speaker.");
        }
        if (!ngyVar.a.equals(nhhVar3.g)) {
            nhhVar3.d();
        }
        nhm nhmVar3 = nhhVar3.f;
        if (nhmVar3 == null) {
            nhmVar3 = nhhVar3.a(ngyVar.a);
        }
        if (nhmVar3.g()) {
            nhmVar3.c();
        } else {
            nhmVar3.f();
        }
        return akwa.a;
    }
}
