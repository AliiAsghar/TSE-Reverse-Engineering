package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gci extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(arrx arrxVar, idb idbVar, aqsm aqsmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = arrxVar;
        this.c = idbVar;
        this.b = aqsmVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((gci) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v116, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v125, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v24, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        iql iqlVar;
        File a;
        int length;
        ResolvedRecipient resolvedRecipient;
        agnw d;
        agnw d2;
        int i = 4;
        Long l = null;
        boolean z = true;
        boolean z2 = true;
        int i2 = 0;
        switch (this.d) {
            case 0:
                aqil.P(obj);
                aqjn.Q(((gcj) this.a).j, rp.k);
                Iterator it = ((gcj) this.a).j.iterator();
                while (it.hasNext()) {
                    arqv arqvVar = (arqv) ((WeakReference) it.next()).get();
                    if (arqvVar != null) {
                        arqvVar.a(this.b, this.c);
                    }
                }
                return arnb.a;
            case 1:
                aqil.P(obj);
                Object obj2 = this.a;
                if (obj2 instanceof gdj) {
                    ((rae) this.c).e((gbb) this.b, (gdj) obj2);
                } else if (obj2 instanceof gdh) {
                    Object obj3 = this.c;
                    Object obj4 = this.b;
                    Throwable th = ((gdh) obj2).a;
                    rae raeVar = (rae) obj3;
                    if (!raeVar.h()) {
                        ((gch) raeVar.h).b((gbb) obj4, new gaw(th));
                    }
                } else if (obj2 instanceof gdi) {
                    rae raeVar2 = (rae) this.c;
                    ((gdk) raeVar2.f).e();
                    raeVar2.d();
                }
                return arnb.a;
            case 2:
                aqil.P(obj);
                for (hbm hbmVar : ((hbb) this.b).b.values()) {
                    hbmVar.getClass();
                    if (hbmVar.e == null) {
                        String str = hbmVar.d;
                        if (arsd.z(str, "data:", false) && arsd.T(str, "base64,", 0, 6) > 0) {
                            try {
                                String substring = str.substring(arsd.S(str, ',', 0, 6) + 1);
                                substring.getClass();
                                byte[] decode = Base64.decode(substring, 0);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                hbmVar.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                            } catch (IllegalArgumentException e) {
                                hhw.b("data URL did not have correct base64 format.", e);
                            }
                        }
                    }
                    Object obj5 = this.c;
                    Object obj6 = this.a;
                    if (hbmVar.e == null && obj6 != null) {
                        String str2 = hbmVar.d;
                        try {
                            InputStream open = ((Context) obj5).getAssets().open(((String) obj6) + str2);
                            open.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                hbmVar.e = hid.d(BitmapFactory.decodeStream(open, null, options2), hbmVar.a, hbmVar.b);
                            } catch (IllegalArgumentException e2) {
                                hhw.b("Unable to decode image.", e2);
                            }
                        } catch (IOException e3) {
                            hhw.b("Unable to open asset.", e3);
                        }
                    }
                }
                return arnb.a;
            case 3:
                aqil.P(obj);
                try {
                    iqlVar = ((idb) this.c).j;
                    a = ((rjx) iqlVar.a).a();
                } catch (idl e4) {
                    ((alwl) ((alwl) ((idb) this.c).i.i()).g(e4)).q("Failed to back up item");
                    z = false;
                }
                if (a != null) {
                    try {
                        ParcelFileDescriptor open2 = ParcelFileDescriptor.open(a, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        open2.getClass();
                        aomb aombVar = abmo.a;
                        aombVar.getClass();
                        aotl.C(aombVar, open2, (aqsm) this.b);
                        ((arrx) this.a).a = z;
                        return arnb.a;
                    } catch (FileNotFoundException e5) {
                        ((alwl) ((alwl) ((aluw) iqlVar.c).i()).g(e5)).q("File not found when opening file descriptor for backup database");
                        throw new idl("File not found when opening file descriptor for backup database", e5);
                    }
                }
                ((alwl) ((aluw) iqlVar.c).i()).q("Backup database copy file is null");
                throw new idl("Backup database copy file is null");
            case 4:
                aqil.P(obj);
                iql iqlVar2 = ((idb) this.c).j;
                icg icgVar = (icg) aqjn.ad(this.b);
                if (icgVar != null) {
                    l = new Long(icgVar.a);
                }
                if (iql.f(l)) {
                    ((arrx) this.a).a = true;
                }
                return arnb.a;
            case 5:
                aqil.P(obj);
                int a2 = rwd.a(((rtn) aqjn.W(this.a)).t());
                ?? r0 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r0, 10));
                for (rtn rtnVar : r0) {
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    amglVar.getClass();
                    boolean au = rtnVar.au();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    Object obj7 = this.c;
                    amgu amguVar = (amgu) amglVar.b;
                    amguVar.c |= 128;
                    amguVar.L = au;
                    akec.aP(rtnVar.n(), amglVar);
                    ity ityVar = (ity) obj7;
                    akec.aO(((lzz) ityVar.a.b()).a(rtnVar.t()), amglVar);
                    akec.aU(MessageData.cY(rtnVar.c()), amglVar);
                    String Q = rtnVar.Q(ityVar.b);
                    if (Q == null) {
                        length = 0;
                    } else {
                        length = (Q.length() / 50) * 50;
                    }
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar2 = (amgu) amglVar.b;
                    amguVar2.c |= 256;
                    amguVar2.M = length;
                    arrayList.add(akec.aN(amglVar));
                }
                ((mdy) this.c).n(new iun(this.b, arrayList, a2, z ? 1 : 0));
                return arnb.a;
            case 6:
                aqil.P(obj);
                if (!((yyt) this.a).z() || !((ansy) ((oxp) this.b).a.b()).e("bugle.enable_debug_menu_action")) {
                    z2 = false;
                }
                ((jdo) this.c).b.f(Boolean.valueOf(z2));
                return arnb.a;
            case 7:
                aqil.P(obj);
                ((jeb) this.c).e.b(new llu(this.b, (lfx) this.a, 3, 2));
                return arnb.a;
            case 8:
                aqil.P(obj);
                yvb yvbVar = (yvb) ((jfr) this.c).c.b();
                Object ag = aqjn.ag(this.a);
                ag.getClass();
                yvbVar.e((ResolvedRecipient) ag, this.b);
                return arnb.a;
            case 9:
                aqil.P(obj);
                alvw g = jly.a.g();
                g.X(alwp.a, "BugleComposeRow2");
                ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend", 152, "DraftAttachmentState.kt")).D("Replacing in draft state: %s with %s", this.c, this.b);
                ((jly) this.a).g.d(new geg(this.c, this.b, 12, null));
                return arnb.a;
            case 10:
                aqil.P(obj);
                Object obj8 = this.a;
                jqh jqhVar = (jqh) this.b;
                jqhVar.a.a(this.c, jqhVar.b.a(obj8));
                return arnb.a;
            case 11:
                aqil.P(obj);
                Object obj9 = this.b;
                obj9.getClass();
                Object obj10 = this.a;
                obj10.getClass();
                aiut.c();
                xcr xcrVar = xcr.SEND_BUTTON_ACCURATE;
                String str3 = ((atok) obj10).b;
                boolean booleanValue = ((Boolean) xcs.j.e()).booleanValue();
                kkc kkcVar = ((jsp) this.c).a;
                if (booleanValue) {
                    ((ConcurrentHashMap) ((xcs) kkcVar.c).u.get(xcrVar.ordinal())).remove(str3);
                }
                ((xcs) kkcVar.c).g(xcr.SEND_BUTTON_ACCURATE, ((atok) obj9).b);
                return arnb.a;
            case 12:
                aqil.P(obj);
                ((kdn) this.c).g.a(this.b, this.a);
                return arnb.a;
            case 13:
                aqil.P(obj);
                ((kdn) this.c).g.a(this.b, this.a);
                return arnb.a;
            case 14:
                aqil.P(obj);
                if (((kke) this.c).k.a() && (resolvedRecipient = (ResolvedRecipient) aqjn.Z(this.a)) != null && resolvedRecipient.w()) {
                    String m = resolvedRecipient.f().m();
                    if (m != null) {
                        kke kkeVar = (kke) this.c;
                        ((mho) kkeVar.i.b()).aN(2, amho.BIZINFO_SOURCE_CONVERSATION_TITLE, m);
                        kkeVar.o.b(new lmr(kkeVar.c.a, m));
                    }
                    return arnb.a;
                }
                kke kkeVar2 = (kke) this.c;
                kkeVar2.o.b(new llu(this.b, kkeVar2.p, 2, 1));
                return arnb.a;
            case 15:
                aqil.P(obj);
                ((cit) this.b).b();
                ?? r12 = this.a;
                if (r12 != 0) {
                    r12.f((View) this.c, false);
                }
                return arnb.a;
            case 16:
                aqil.P(obj);
                ((agnq) ((luz) this.c).b.b()).e("addAttachmentFileMetadata", new irs(this.a, this.b, 15));
                return arnb.a;
            case 17:
                aqil.P(obj);
                ((agnq) ((luz) this.c).b.b()).e("completeActiveExecution", new itl(this.a, this.c, this.b, 6, (short[]) null));
                return arnb.a;
            case 18:
                aqil.P(obj);
                String[] strArr = tip.a;
                int i3 = tfq.a;
                tig tigVar = new tig();
                tigVar.d(Optional.of(this.a));
                tigVar.b((lwz) this.b);
                lgc lgcVar = luz.g;
                tigVar.e(((luz) this.c).c.f());
                tigVar.f(lwr.CREATED);
                tigVar.g(((luz) this.c).c.f());
                tigVar.c(yuv.a(((luz) this.c).e).b);
                tie a3 = tigVar.a(new tif(i2));
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "restore_workflow_executions", a3, new tbe(d, 20), new ter(a3, i));
                return arnb.a;
            case 19:
                aqil.P(obj);
                tim a4 = tip.a();
                Object obj11 = this.a;
                a4.c(new lut(obj11, i));
                agmq n = a4.b().n();
                try {
                    if (((tij) n).getCount() != 0) {
                        Object obj12 = this.b;
                        Object obj13 = this.c;
                        armd.i(n, null);
                        tin tinVar = new tin();
                        tinVar.c((lwr) obj12);
                        tinVar.d(((luz) obj13).c.f());
                        tinVar.b(Optional.of(obj11));
                        return arnb.a;
                    }
                    throw new IllegalArgumentException(a.cc(obj11, "restore execution with sessionId [", "] does not exist"));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        armd.i(n, th2);
                        throw th3;
                    }
                }
            default:
                aqil.P(obj);
                alvw g2 = lvu.a.g();
                g2.X(alwp.a, "BugleBackup");
                ((alvg) g2.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$completeRestore$2$1", "invokeSuspend", 211, "BasicRestoreWorkflowSteps.kt")).t("Requested restore completed [%s]", this.a);
                ((lxa) ((lvu) this.c).c.b()).b((UUID) this.a, 1);
                ((lxa) ((lvu) this.c).c.b()).e((UUID) this.a);
                ((lxa) ((lvu) this.c).c.b()).d((UUID) this.a, (lwr) this.b);
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, jgx] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r6v18, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [oxz, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                return new gci((gcj) obj2, (gbb) this.b, (gaz) this.c, arpeVar, 0);
            case 1:
                Object obj3 = this.a;
                return new gci((dyi) obj3, (rae) this.c, (gbb) this.b, arpeVar, 1);
            case 2:
                Object obj4 = this.b;
                return new gci((hbb) obj4, (Context) this.c, (String) this.a, arpeVar, 2);
            case 3:
                Object obj5 = this.a;
                return new gci((arrx) obj5, (idb) this.c, (aqsm) this.b, arpeVar, 3);
            case 4:
                return new gci((idb) this.c, (List) this.b, (arrx) this.a, arpeVar, 4);
            case 5:
                return new gci((Collection) this.a, (ity) this.c, (amgf) this.b, arpeVar, 5);
            case 6:
                Object obj6 = this.c;
                return new gci((jdo) obj6, (yyt) this.a, (oxz) this.b, arpeVar, 6);
            case 7:
                return new gci((jeb) this.c, (miu) this.b, (lfx) this.a, arpeVar, 7);
            case 8:
                Object obj7 = this.c;
                return new gci((jfr) obj7, (alog) this.a, (ConversationId) this.b, arpeVar, 8);
            case 9:
                return new gci((jgx) this.c, (jgz) this.b, (jly) this.a, arpeVar, 9);
            case 10:
                Object obj8 = this.b;
                return new gci((jqh) obj8, (jhb) this.c, (spa) this.a, arpeVar, 10);
            case 11:
                Object obj9 = this.c;
                return new gci((jsp) obj9, (atok) this.a, (atok) this.b, arpeVar, 11);
            case 12:
                return new gci((kdn) this.c, (MessageId) this.b, (mxr) this.a, arpeVar, 12);
            case 13:
                return new gci((kdn) this.c, (MessageId) this.b, (mxr) this.a, arpeVar, 13, (byte[]) null);
            case 14:
                Object obj10 = this.c;
                return new gci((kke) obj10, (alog) this.a, (miu) this.b, arpeVar, 14);
            case 15:
                return new gci((cit) this.b, (agak) this.a, (View) this.c, arpeVar, 15);
            case 16:
                Object obj11 = this.c;
                return new gci((luz) obj11, (UUID) this.a, (lwq) this.b, arpeVar, 16);
            case 17:
                Object obj12 = this.c;
                return new gci((luz) obj12, (UUID) this.a, (lwr) this.b, arpeVar, 17);
            case 18:
                Object obj13 = this.a;
                return new gci((UUID) obj13, (lwz) this.b, (luz) this.c, arpeVar, 18);
            case 19:
                Object obj14 = this.c;
                return new gci((luz) obj14, (UUID) this.a, (lwr) this.b, arpeVar, 19, (byte[]) null);
            default:
                Object obj15 = this.a;
                return new gci((UUID) obj15, (lvu) this.c, (lwr) this.b, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(cit citVar, agak agakVar, View view, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = citVar;
        this.a = agakVar;
        this.c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(dyi dyiVar, rae raeVar, gbb gbbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = dyiVar;
        this.c = raeVar;
        this.b = gbbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(gcj gcjVar, gbb gbbVar, gaz gazVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = gcjVar;
        this.b = gbbVar;
        this.c = gazVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(hbb hbbVar, Context context, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = hbbVar;
        this.c = context;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(idb idbVar, List list, arrx arrxVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = idbVar;
        this.b = list;
        this.a = arrxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(Collection collection, ity ityVar, amgf amgfVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = collection;
        this.c = ityVar;
        this.b = amgfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(UUID uuid, lvu lvuVar, lwr lwrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = uuid;
        this.c = lvuVar;
        this.b = lwrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(UUID uuid, lwz lwzVar, luz luzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = uuid;
        this.b = lwzVar;
        this.c = luzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jdo jdoVar, yyt yytVar, oxz oxzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jdoVar;
        this.a = yytVar;
        this.b = oxzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jeb jebVar, miu miuVar, lfx lfxVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jebVar;
        this.b = miuVar;
        this.a = lfxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jfr jfrVar, alog alogVar, ConversationId conversationId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jfrVar;
        this.a = alogVar;
        this.b = conversationId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jgx jgxVar, jgz jgzVar, jly jlyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jgxVar;
        this.b = jgzVar;
        this.a = jlyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jqh jqhVar, jhb jhbVar, spa spaVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = jqhVar;
        this.c = jhbVar;
        this.a = spaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(jsp jspVar, atok atokVar, atok atokVar2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jspVar;
        this.a = atokVar;
        this.b = atokVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(kdn kdnVar, MessageId messageId, mxr mxrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kdnVar;
        this.b = messageId;
        this.a = mxrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(kdn kdnVar, MessageId messageId, mxr mxrVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = kdnVar;
        this.b = messageId;
        this.a = mxrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(kke kkeVar, alog alogVar, miu miuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kkeVar;
        this.a = alogVar;
        this.b = miuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(luz luzVar, UUID uuid, lwq lwqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = luzVar;
        this.a = uuid;
        this.b = lwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(luz luzVar, UUID uuid, lwr lwrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = luzVar;
        this.a = uuid;
        this.b = lwrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci(luz luzVar, UUID uuid, lwr lwrVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = luzVar;
        this.a = uuid;
        this.b = lwrVar;
    }
}
