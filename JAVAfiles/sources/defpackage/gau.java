package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gau extends arpw implements arqv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(arxm arxmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = arxmVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((gau) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                c((asaj) obj, (arpe) obj2);
                return a.I(arnb.a);
            case 3:
                return ((gau) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((gau) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((gau) c((gvf) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((gau) c(bool, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((gau) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((gau) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r6v68, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v77, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v83, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object apply;
        switch (this.b) {
            case 0:
                aqil.P(obj);
                ((gav) this.a).k.e(gbb.REFRESH, gax.a);
                return arnb.a;
            case 1:
                aqil.P(obj);
                this.a.A();
                return arnb.a;
            case 2:
                return a.I(obj);
            case 3:
                aqil.P(obj);
                gcd gcdVar = (gcd) this.a;
                gcdVar.h.c(new Integer(gcdVar.f));
                return arnb.a;
            case 4:
                aqil.P(obj);
                gcd gcdVar2 = (gcd) this.a;
                gcdVar2.g.c(new Integer(gcdVar2.e));
                return arnb.a;
            case 5:
                aqil.P(obj);
                return ((geb) this.a).b.a();
            case 6:
                aqil.P(obj);
                String str = hap.a;
                gsy a = gsy.a();
                Object obj2 = this.a;
                Objects.toString(obj2);
                a.c(str, "Constraints changed for ".concat(String.valueOf(obj2)));
                return arnb.a;
            case 7:
                aqil.P(obj);
                iql iqlVar = ((idb) this.a).j;
                File a2 = ((rjx) iqlVar.a).a();
                if (a2 != null) {
                    try {
                        ParcelFileDescriptor open = ParcelFileDescriptor.open(a2, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        try {
                            long statSize = open.getStatSize();
                            armd.i(open, null);
                            return new Long(statSize);
                        } finally {
                        }
                    } catch (FileNotFoundException e) {
                        ((alwl) ((alwl) ((aluw) iqlVar.c).i()).g(e)).q("Unable to get size of backup database");
                        throw new idl("Unable to open the backup database file", e);
                    }
                } else {
                    throw new idl("Unable to open the backup database file");
                }
            case 8:
                aqil.P(obj);
                UUID c = ((idb) this.a).e.c();
                if (c != null) {
                    return c;
                }
                throw new IllegalStateException("No sessionId found in SharedPrefs");
            case 9:
                aqil.P(obj);
                return ((idg) this.a).c.c();
            case 10:
                aqil.P(obj);
                return ((idg) this.a).c.c();
            case 11:
                aqil.P(obj);
                ((ieo) this.a).b.a();
                return arnb.a;
            case 12:
                aqil.P(obj);
                ((Optional) ((apxx) ((jbt) this.a).f).a).ifPresent(new ixj(new gvj(20), 9));
                return arnb.a;
            case 13:
                aqil.P(obj);
                ((alvg) jcy.a.h().h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$2", "invokeSuspend", 91, "ActionsUiAdapterImpl.kt")).t("Flow for %s did not emit within timeout. Initial null ActionUiData will be used until it emits.", this.a.getClass().getSimpleName());
                return arnb.a;
            case 14:
                aqil.P(obj);
                return Boolean.valueOf(this.a.o());
            case 15:
                aqil.P(obj);
                ((mbl) ((lig) this.a).b.b()).c("Bugle.DirectSend.FastImageSending.TuneButtonClick.Count");
                return arnb.a;
            case 16:
                aqil.P(obj);
                return gh.c((String) this.a);
            case 17:
                aqil.P(obj);
                ((mbl) ((jat) this.a).d.b()).c("Bugle.ComposeRow.ConstraintNotices.VideoDurationTooLongDialog.Opened.Count");
                return arnb.a;
            case 18:
                aqil.P(obj);
                ((mbl) ((jat) this.a).d.b()).c("Bugle.ComposeRow.ConstraintNotices.VideoDurationTooLongDialog.Dismissed.Count");
                return arnb.a;
            case 19:
                aqil.P(obj);
                ConversationIdType b = ruy.b(((jpm) this.a).b.b());
                spg b2 = spj.b();
                b2.w("drafts.queryOnConversationId");
                spi spiVar = new spi();
                spiVar.b(b);
                b2.k(new agpw(spiVar));
                return (spa) agnc.b(b2.b());
            default:
                aqil.P(obj);
                alvw d = jpm.a.d();
                d.X(alwp.a, "BugleComposeRow2");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.q, ((jpm) this.a).b);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$remove$2", "invokeSuspend", 94, "ConversationDraftPersistence.kt")).q("Persistence removing draft");
                spe speVar = new spe();
                speVar.f("ConversationDraftPersistence.remove");
                apply = new ivi(this.a, 15).apply(new spi());
                speVar.a = new agpw((spi) apply);
                return new Integer(speVar.d());
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, jcu] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arxm] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.b) {
            case 0:
                return new gau((gav) this.a, arpeVar, 0);
            case 1:
                return new gau((arxm) this.a, arpeVar, 1);
            case 2:
                return new gau((kkc) this.a, arpeVar, 2);
            case 3:
                return new gau((gcd) this.a, arpeVar, 3);
            case 4:
                return new gau((gcd) this.a, arpeVar, 4, (byte[]) null);
            case 5:
                return new gau((geb) this.a, arpeVar, 5);
            case 6:
                return new gau((gys) this.a, arpeVar, 6);
            case 7:
                return new gau((idb) this.a, arpeVar, 7);
            case 8:
                return new gau((idb) this.a, arpeVar, 8, (byte[]) null);
            case 9:
                return new gau((idg) this.a, arpeVar, 9);
            case 10:
                return new gau((idg) this.a, arpeVar, 10, (byte[]) null);
            case 11:
                return new gau((ieo) this.a, arpeVar, 11);
            case 12:
                gau gauVar = new gau((jbt) this.a, arpeVar, 12);
                ((Boolean) obj).booleanValue();
                return gauVar;
            case 13:
                return new gau((jcu) this.a, arpeVar, 13);
            case 14:
                return new gau((nfw) this.a, arpeVar, 14);
            case 15:
                return new gau((lig) this.a, arpeVar, 15);
            case 16:
                return new gau((String) this.a, arpeVar, 16);
            case 17:
                return new gau((jat) this.a, arpeVar, 17);
            case 18:
                return new gau((jat) this.a, arpeVar, 18, (byte[]) null);
            case 19:
                return new gau((jpm) this.a, arpeVar, 19);
            default:
                return new gau((jpm) this.a, arpeVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gav gavVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = gavVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gcd gcdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = gcdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gcd gcdVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = gcdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(geb gebVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = gebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gys gysVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = gysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(idb idbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = idbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(idb idbVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = idbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(idg idgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = idgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(idg idgVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = idgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(ieo ieoVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = ieoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jat jatVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jatVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jat jatVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jatVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jbt jbtVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jcu jcuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jcuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jpm jpmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = jpmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(jpm jpmVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = jpmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(kkc kkcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kkcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(lig ligVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = ligVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(nfw nfwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = nfwVar;
    }
}
