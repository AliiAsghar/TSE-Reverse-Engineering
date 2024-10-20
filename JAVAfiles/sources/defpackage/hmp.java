package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.communication.synapse.security.scytale.Scope;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmp extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(afgv afgvVar, Uri uri, afsw afswVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = afgvVar;
        this.c = uri;
        this.b = afswVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return ((hmp) c((arzu) obj, (arpe) obj2)).b(arnb.a);
                        }
                        return ((hmp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((hmp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((hmp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((hmp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((hmp) c((arzu) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v28, types: [afsw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object b;
        arwe arweVar;
        Object j;
        akrh akrhVar;
        ArrayList arrayList;
        Object c;
        Object b2;
        int i = this.f;
        ?? r1 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            arpl arplVar = arpl.a;
                            int i2 = this.a;
                            aqil.P(obj);
                            if (i2 == 0) {
                                arzu arzuVar = (arzu) this.e;
                                Object obj2 = this.d;
                                Object obj3 = this.b;
                                Object obj4 = this.c;
                                afjy afjyVar = (afjy) obj2;
                                arpi b3 = afjyVar.c.b();
                                wju wjuVar = new wju(afjyVar, (agrk) obj3, arzuVar, (arpe) null, (afjy) obj4, 10);
                                this.a = 1;
                                if (arro.q(b3, wjuVar, this) == arplVar) {
                                    return arplVar;
                                }
                            }
                            return arnb.a;
                        }
                        arpl arplVar2 = arpl.a;
                        int i3 = this.a;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                aqil.P(obj);
                                b2 = obj;
                                return (afts) b2;
                            }
                            aqil.P(obj);
                            c = obj;
                        } else {
                            aqil.P(obj);
                            arwe arweVar2 = (arwe) this.e;
                            Object obj5 = this.d;
                            Object obj6 = this.c;
                            Object obj7 = this.b;
                            afgi afgiVar = afgi.a;
                            aetz aetzVar = new aetz(obj7, 18);
                            this.e = arweVar2;
                            this.a = 1;
                            c = ((afgv) obj5).e.c((Uri) obj6, afgiVar, true, aetzVar, this);
                            if (c == arplVar2) {
                                return arplVar2;
                            }
                        }
                        afcq afcqVar = (afcq) c;
                        if (afcqVar == null) {
                            ?? r12 = this.b;
                            Object obj8 = this.d;
                            Object obj9 = this.c;
                            ((alvg) afgv.b.i().h("com/google/android/libraries/compose/cameragallery/ui/camera/SystemCameraLauncher$processMediaCapture$2", "invokeSuspend", 169, "SystemCameraLauncher.kt")).t("Resolving directly %s system camera media capture", r12.b());
                            Object obj10 = afgv.a.get(r12);
                            obj10.getClass();
                            afgi afgiVar2 = afgi.a;
                            this.e = null;
                            this.a = 2;
                            b2 = ((afgv) obj8).f.b((afru) obj10, (Uri) obj9, afgiVar2, this);
                            if (b2 == arplVar2) {
                                return arplVar2;
                            }
                            return (afts) b2;
                        }
                        return afcqVar;
                    }
                    arpl arplVar3 = arpl.a;
                    if (this.a != 0) {
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        arwe arweVar3 = (arwe) this.e;
                        apax apaxVar = ((twm) this.c).c;
                        apaxVar.getClass();
                        Object obj11 = this.d;
                        Object obj12 = this.b;
                        ArrayList arrayList2 = new ArrayList(aqjn.J(apaxVar, 10));
                        Iterator it = apaxVar.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(arrn.I(arweVar3, null, null, new jsf((twl) it.next(), (twn) obj11, (Scope) obj12, (arpe) null, 2), 3));
                        }
                        this.a = 1;
                        if (arrj.j(arrayList2, this) == arplVar3) {
                            return arplVar3;
                        }
                    }
                    return upm.b();
                }
                Object obj13 = arpl.a;
                try {
                    if (this.a != 0) {
                        Closeable closeable = (Closeable) this.e;
                        aqil.P(obj);
                        j = obj;
                        r1 = closeable;
                    } else {
                        aqil.P(obj);
                        arwe arweVar4 = (arwe) this.e;
                        Object obj14 = this.b;
                        ?? r5 = this.c;
                        Object obj15 = this.d;
                        akrh e = aktp.e("OutgoingMessageInsertionListenersManager::onAfterInsertion");
                        try {
                            Collection<rwt> b4 = ((rwv) obj14).b();
                            ArrayList arrayList3 = new ArrayList(aqjn.J(b4, 10));
                            for (rwt rwtVar : b4) {
                                try {
                                    arrayList = arrayList3;
                                    akrhVar = e;
                                } catch (Throwable th) {
                                    th = th;
                                    akrhVar = e;
                                }
                                try {
                                    arrayList.add(arrn.I(arweVar4, ((rwv) obj14).b, null, new mmz(rwtVar, (MessageCoreData) r5, (MessageIdType) obj15, (arpe) null, 14), 2));
                                    arrayList3 = arrayList;
                                    e = akrhVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = akrhVar;
                                    Closeable closeable2 = r1;
                                    Throwable th3 = th;
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        armd.i(closeable2, th3);
                                        throw th4;
                                    }
                                }
                            }
                            ArrayList arrayList4 = arrayList3;
                            akrh akrhVar2 = e;
                            this.e = akrhVar2;
                            this.a = 1;
                            j = arrj.j(arrayList4, this);
                            r1 = akrhVar2;
                            if (j == obj13) {
                                return obj13;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r1 = e;
                        }
                    }
                    obj13 = (List) j;
                    armd.i(r1, null);
                    return obj13;
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    arweVar = (arwe) this.e;
                    aqil.P(obj);
                    b = obj;
                } else {
                    aqil.P(obj);
                    arwe arweVar5 = (arwe) this.e;
                    Object obj16 = this.c;
                    Object obj17 = this.b;
                    this.e = arweVar5;
                    this.a = 1;
                    b = ((gdk) ((rae) obj16).f).b((gdg) obj17, this);
                    if (b != arplVar4) {
                        arweVar = arweVar5;
                    } else {
                        return arplVar4;
                    }
                }
                rae raeVar = (rae) this.c;
                dyi dyiVar = (dyi) b;
                if (((gdk) raeVar.f).h()) {
                    raeVar.d();
                    return arnb.a;
                }
                arrn.J(arweVar, raeVar.c, null, new gci(dyiVar, raeVar, (gbb) this.d, (arpe) null, 1), 2);
                return arnb.a;
            }
        } else {
            arpl arplVar5 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                arzu arzuVar2 = (arzu) this.e;
                hmo hmoVar = new hmo(arzuVar2, (hld) this.b);
                Object obj18 = this.c;
                ((hlp) obj18).u(hmoVar, hmoVar, (hwu) obj18, new sp(9));
                gqx gqxVar = new gqx(this.d, hmoVar, 7, null);
                this.a = 1;
                if (arhi.p(arzuVar2, gqxVar, this) == arplVar5) {
                    return arplVar5;
                }
            }
            return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v7, types: [afsw, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Object obj2 = this.d;
                            afjy afjyVar = (afjy) obj2;
                            hmp hmpVar = new hmp(afjyVar, (agrk) this.b, arpeVar, (afjy) this.c, 5);
                            hmpVar.e = obj;
                            return hmpVar;
                        }
                        Object obj3 = this.d;
                        afgv afgvVar = (afgv) obj3;
                        hmp hmpVar2 = new hmp(afgvVar, (Uri) this.c, (afsw) this.b, arpeVar, 4);
                        hmpVar2.e = obj;
                        return hmpVar2;
                    }
                    Object obj4 = this.c;
                    twm twmVar = (twm) obj4;
                    hmp hmpVar3 = new hmp(twmVar, (twn) this.d, (Scope) this.b, arpeVar, 3);
                    hmpVar3.e = obj;
                    return hmpVar3;
                }
                hmp hmpVar4 = new hmp((rwv) this.b, (MessageCoreData) this.c, (MessageIdType) this.d, arpeVar, 2);
                hmpVar4.e = obj;
                return hmpVar4;
            }
            Object obj5 = this.c;
            rae raeVar = (rae) obj5;
            hmp hmpVar5 = new hmp(raeVar, (gdg) this.b, (gbb) this.d, arpeVar, 1);
            hmpVar5.e = obj;
            return hmpVar5;
        }
        Object obj6 = this.b;
        hld hldVar = (hld) obj6;
        hmp hmpVar6 = new hmp(hldVar, (hlp) this.c, (hls) this.d, arpeVar, 0);
        hmpVar6.e = obj;
        return hmpVar6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(afjy afjyVar, agrk agrkVar, arpe arpeVar, afjy afjyVar2, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = afjyVar;
        this.b = agrkVar;
        this.c = afjyVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(hld hldVar, hlp hlpVar, hls hlsVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = hldVar;
        this.c = hlpVar;
        this.d = hlsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(rae raeVar, gdg gdgVar, gbb gbbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = raeVar;
        this.b = gdgVar;
        this.d = gbbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(rwv rwvVar, MessageCoreData messageCoreData, MessageIdType messageIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = rwvVar;
        this.c = messageCoreData;
        this.d = messageIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(twm twmVar, twn twnVar, Scope scope, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = twmVar;
        this.d = twnVar;
        this.b = scope;
    }
}
