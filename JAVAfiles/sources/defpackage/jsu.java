package defpackage;

import android.media.MediaPlayer;
import com.google.android.apps.messaging.R;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsu extends arpw implements arqv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(alog alogVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = alogVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jsu) c(bool, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((jsu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v101, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v105, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v109, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v93, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v97, types: [mbl, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        switch (this.b) {
            case 0:
                aqil.P(obj);
                alvw e = jsy.a.e();
                e.X(alwp.a, "BugleComposeRow2");
                ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onDismiss$1", "invokeSuspend", 187, "SubjectUrgentUiAdapterImpl.kt")).q("Dismissing subject/urgent row");
                ((jsy) this.a).i.e(jld.p);
                ((jsy) this.a).c.f(false);
                return arnb.a;
            case 1:
                aqil.P(obj);
                String string = ((jru) this.a).a.getString(R.string.send_sound_pref_key);
                string.getClass();
                return Boolean.valueOf(((jru) this.a).c.q(string, ((jru) this.a).a.getResources().getBoolean(R.bool.send_sound_pref_default)));
            case 2:
                aqil.P(obj);
                jto jtoVar = (jto) this.a;
                boolean e2 = ((ansy) ((ouw) jtoVar.e).a.b()).e("bugle.enable_hugo_draft_controller_on_send_dispatch");
                aflb aflbVar = jtoVar.k.f;
                if (e2) {
                    aflbVar.g();
                }
                if (jtoVar.j) {
                    alvw d = jto.a.d();
                    d.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$onDraftClearedForSending$1", "invokeSuspend", 334, "DraftTextUiAdapterImpl.kt")).q("DraftTextUiAdapterImpl.onDraftClearedForSending clearing text for sending");
                }
                aflbVar.e();
                ((jto) this.a).h.incrementAndGet();
                return arnb.a;
            case 3:
                aqil.P(obj);
                if (((Boolean) yig.aj.e()).booleanValue() && !((jub) this.a).u.get()) {
                    ((jub) this.a).u.set(true);
                    ((ksi) ((jub) this.a).g.b()).a();
                }
                return arnb.a;
            case 4:
                aqil.P(obj);
                Object obj2 = this.a;
                ((jvf) obj2).k.e(true, new jsv(obj2, 6));
                return arnb.a;
            case 5:
                aqil.P(obj);
                for (Object obj3 : this.a) {
                    if (((nfw) obj3).o()) {
                        return obj3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 6:
                aqil.P(obj);
                psi psiVar = (psi) ((jwp) this.a).g.b();
                aozy createBuilder = amtn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtn amtnVar = (amtn) createBuilder.b;
                amtnVar.c = 3;
                amtnVar.b |= 1;
                psiVar.h((amtn) createBuilder.s());
                return arnb.a;
            case 7:
                aqil.P(obj);
                jwp jwpVar = (jwp) this.a;
                qjh.l(jwpVar.c, null, new jsu(jwpVar, (arpe) null, 6), 3);
                return arnb.a;
            case 8:
                aqil.P(obj);
                psi psiVar2 = (psi) ((jwp) this.a).g.b();
                aozy createBuilder2 = amtn.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amtn amtnVar2 = (amtn) createBuilder2.b;
                amtnVar2.c = 2;
                amtnVar2.b |= 1;
                psiVar2.h((amtn) createBuilder2.s());
                return arnb.a;
            case 9:
                aqil.P(obj);
                ((wpb) ((iji) this.a).a).a();
                return arnb.a;
            case 10:
                aqil.P(obj);
                ((kbi) this.a).g.a();
                return arnb.a;
            case 11:
                aqil.P(obj);
                kbn kbnVar = (kbn) this.a;
                MediaPlayer mediaPlayer = kbnVar.e;
                mediaPlayer.getClass();
                mediaPlayer.setDataSource(kbnVar.a, kbnVar.c);
                MediaPlayer mediaPlayer2 = ((kbn) this.a).e;
                mediaPlayer2.getClass();
                mediaPlayer2.prepare();
                return arnb.a;
            case 12:
                aqil.P(obj);
                ((kep) this.a).n.a();
                return arnb.a;
            case 13:
                aqil.P(obj);
                ((kff) this.a).f.b(loc.a);
                return arnb.a;
            case 14:
                aqil.P(obj);
                ((jxv) this.a).b.c("Bugle.Conv2.Paging.BackendInconsistencyError.Count");
                return arnb.a;
            case 15:
                aqil.P(obj);
                ((jxv) this.a).b.c("Bugle.Conv2.Paging.ErrorRecovery");
                return arnb.a;
            case 16:
                aqil.P(obj);
                ((jxv) this.a).b.c("Bugle.Conv2.Paging.GenericError.Count");
                return arnb.a;
            case 17:
                aqil.P(obj);
                ((jxv) this.a).b.c("Bugle.Conv2.Paging.TooManyBackendConsistencyErrors.Count");
                return arnb.a;
            case 18:
                aqil.P(obj);
                ((jxv) this.a).b.c("Bugle.Conv2.Paging.TooManyGenericErrors.Count");
                return arnb.a;
            case 19:
                aqil.P(obj);
                kwx kwxVar = (kwx) arsd.k(((kxc) this.a).a);
                if (kwxVar == null) {
                    return null;
                }
                kwxVar.b(2);
                return arnb.a;
            default:
                aqil.P(obj);
                kwx kwxVar2 = (kwx) arsd.k(((kzj) this.a).b);
                if (kwxVar2 == null) {
                    return null;
                }
                kwxVar2.b(1);
                return arnb.a;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.b) {
            case 0:
                return new jsu((jsy) this.a, arpeVar, 0);
            case 1:
                return new jsu((jru) this.a, arpeVar, 1);
            case 2:
                return new jsu((jto) this.a, arpeVar, 2);
            case 3:
                return new jsu((jub) this.a, arpeVar, 3);
            case 4:
                return new jsu((jvf) this.a, arpeVar, 4);
            case 5:
                return new jsu((alog) this.a, arpeVar, 5);
            case 6:
                return new jsu((jwp) this.a, arpeVar, 6);
            case 7:
                return new jsu((jwp) this.a, arpeVar, 7, (byte[]) null);
            case 8:
                return new jsu((jwp) this.a, arpeVar, 8, (char[]) null);
            case 9:
                return new jsu((iji) this.a, arpeVar, 9);
            case 10:
                return new jsu((kbi) this.a, arpeVar, 10);
            case 11:
                return new jsu((kbn) this.a, arpeVar, 11);
            case 12:
                return new jsu((kep) this.a, arpeVar, 12);
            case 13:
                return new jsu((kff) this.a, arpeVar, 13);
            case 14:
                return new jsu((jxv) this.a, arpeVar, 14);
            case 15:
                return new jsu((jxv) this.a, arpeVar, 15, (byte[]) null);
            case 16:
                return new jsu((jxv) this.a, arpeVar, 16, (char[]) null);
            case 17:
                return new jsu((jxv) this.a, arpeVar, 17, (short[]) null);
            case 18:
                return new jsu((jxv) this.a, arpeVar, 18, (int[]) null);
            case 19:
                return new jsu((kxc) this.a, arpeVar, 19);
            default:
                return new jsu((kzj) this.a, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(iji ijiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = ijiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jru jruVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jruVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jsy jsyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jsyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jto jtoVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jtoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jub jubVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jubVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jvf jvfVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jvfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jwp jwpVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jwp jwpVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jwp jwpVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jxv jxvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jxv jxvVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jxv jxvVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jxv jxvVar, arpe arpeVar, int i, int[] iArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(jxv jxvVar, arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kbi kbiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kbn kbnVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kep kepVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kepVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kff kffVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kxc kxcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kxcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsu(kzj kzjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kzjVar;
    }
}
