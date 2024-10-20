package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mib implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mib(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.e = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        tap k;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) ((aaue) this.c).d.get();
                                if (locationAttachmentPickerActivity != null) {
                                    int i2 = this.a;
                                    aaug aaugVar = locationAttachmentPickerActivity.I;
                                    if (i2 > 0 && i2 < aaugVar.c.size()) {
                                        ?? r3 = this.d;
                                        uem uemVar = (uem) aaugVar.c.get(i2 - 1);
                                        if (TextUtils.equals(uemVar.b.q, r3)) {
                                            uemVar.c = (Bitmap) this.b;
                                            aaugVar.q(i2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            Object obj = this.c;
                            aksr aksrVar = ((zwi) obj).e;
                            int i3 = this.a;
                            Object obj2 = this.b;
                            Object obj3 = this.d;
                            akrc b = aksrVar.b("UnblockUnspamBanner:undoUnblockUnspamClick");
                            try {
                                qiu.h(((yyz) ((zwi) obj).o.a.b()).e(yyb.bq((xxn) obj2, (amfe) obj3, i3)));
                                b.close();
                            } finally {
                            }
                        } else {
                            qiu.e(((uqg) this.b).c.schedule(akto.j(new qq(this.c, this.d, this.a, 19, (char[]) null)), 3L, TimeUnit.SECONDS));
                        }
                    } else {
                        for (msh mshVar : ((xaz) this.c).b) {
                            String j = mshVar.j(((Boolean) new msn(18).get()).booleanValue());
                            if (TextUtils.isEmpty(j)) {
                                rul.a.q("empty recipient, skipping.");
                            } else {
                                int i4 = this.a;
                                if (((Boolean) new mss(18).get()).booleanValue()) {
                                    k = rxn.h(i4, mshVar);
                                } else {
                                    k = rxn.k(i4, j);
                                }
                                if (TextUtils.isEmpty(k.g)) {
                                    rul.a.q("empty send destination after building participant, skipping.");
                                } else {
                                    Object obj4 = this.d;
                                    ((rxq) ((rul) this.b).g.b()).h(k);
                                    ((ArrayList) obj4).add(k.a());
                                }
                            }
                        }
                    }
                } else {
                    Object obj5 = this.b;
                    FallbackToXmsAction fallbackToXmsAction = (FallbackToXmsAction) obj5;
                    nfx nfxVar = (nfx) fallbackToXmsAction.e.b();
                    ?? r6 = this.c;
                    qiu.h(nfxVar.c(r6.v()).h(new lsx(obj5, (Object) r6, this.a, this.d, 3), fallbackToXmsAction.j));
                }
            } else {
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_BUSINESS_MESSAGING_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = amiz.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ?? r62 = this.c;
                amiz amizVar = (amiz) createBuilder.b;
                amizVar.c = 4;
                amizVar.b |= 1;
                aozy createBuilder2 = amiy.a.createBuilder();
                String ag = albo.ag(r62.m());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj6 = this.d;
                Object obj7 = this.b;
                amiy amiyVar = (amiy) createBuilder2.b;
                amiyVar.b = 1 | amiyVar.b;
                amiyVar.c = ag;
                mic micVar = (mic) obj7;
                long b2 = ((lzz) micVar.q.b()).b((String) obj6);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amiy amiyVar2 = (amiy) apagVar;
                amiyVar2.b |= 8;
                amiyVar2.f = b2;
                amir amirVar = amir.NOT_VERIFIABLE;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                int i5 = this.a;
                amiy amiyVar3 = (amiy) createBuilder2.b;
                amiyVar3.e = amirVar.g;
                amiyVar3.b = 4 | amiyVar3.b;
                amhb x = ((lfl) micVar.s.b()).x(i5);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amiy amiyVar4 = (amiy) createBuilder2.b;
                amiyVar4.d = x;
                amiyVar4.b |= 2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amiz amizVar2 = (amiz) createBuilder.b;
                amiy amiyVar5 = (amiy) createBuilder2.s();
                amiyVar5.getClass();
                amizVar2.d = amiyVar5;
                amizVar2.b = 2 | amizVar2.b;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amiz amizVar3 = (amiz) createBuilder.s();
                amizVar3.getClass();
                amfrVar2.ae = amizVar3;
                amfrVar2.d |= 16;
                micVar.x.n(amfqVar);
            }
        } else {
            int i6 = this.a;
            Object obj8 = this.d;
            Object obj9 = this.c;
            Object obj10 = this.b;
            akrh e = aktp.e("UsageStatisticsImpl#logConversationClicked");
            try {
                if (!((mic) obj10).y.get()) {
                    ((mic) obj10).r();
                } else {
                    boolean K = ((rwd) ((mic) obj10).p.b()).K((ConversationIdType) obj9);
                    akrh e2 = aktp.e("MessageDatabaseOperations#getConversationHasDraftMessage");
                    try {
                        sxy d = MessagesTable.d();
                        d.w("getConversationHasDraftMessage");
                        d.g(new ruw(obj9, 14));
                        boolean K2 = d.b().K();
                        e2.close();
                        aozy createBuilder3 = amfh.a.createBuilder();
                        long a = ((lzz) ((mic) obj10).q.b()).a((ConversationIdType) obj9);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar2 = createBuilder3.b;
                        amfh amfhVar = (amfh) apagVar2;
                        amfhVar.b |= 65536;
                        amfhVar.r = a;
                        if (!apagVar2.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar3 = createBuilder3.b;
                        amfh amfhVar2 = (amfh) apagVar3;
                        amfhVar2.e = 4;
                        amfhVar2.b |= 1;
                        if (!apagVar3.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar4 = createBuilder3.b;
                        amfh amfhVar3 = (amfh) apagVar4;
                        amfhVar3.f = ((amfe) obj8).t;
                        amfhVar3.b = 2 | amfhVar3.b;
                        if (!apagVar4.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar5 = createBuilder3.b;
                        amfh amfhVar4 = (amfh) apagVar5;
                        amfhVar4.b |= 4194304;
                        amfhVar4.w = i6;
                        if (!apagVar5.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar6 = createBuilder3.b;
                        amfh amfhVar5 = (amfh) apagVar6;
                        amfhVar5.b |= 32;
                        amfhVar5.i = K;
                        if (!apagVar6.isMutable()) {
                            createBuilder3.u();
                        }
                        amfh amfhVar6 = (amfh) createBuilder3.b;
                        amfhVar6.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                        amfhVar6.z = K2;
                        akul ag2 = aktp.ag(null);
                        if (((Optional) ((apxx) ((mic) obj10).E).a).isPresent()) {
                            ag2 = ((lbq) ((Optional) ((apxx) ((mic) obj10).E).a).get()).a();
                        }
                        qiu.h(ag2.h(new kxr(obj10, createBuilder3, obj8, 7), ((mic) obj10).A));
                    } finally {
                    }
                }
                e.close();
            } finally {
            }
        }
    }

    public /* synthetic */ mib(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }

    public /* synthetic */ mib(Object obj, Object obj2, Object obj3, int i, int i2, byte[] bArr) {
        this.e = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.a = i;
    }
}
