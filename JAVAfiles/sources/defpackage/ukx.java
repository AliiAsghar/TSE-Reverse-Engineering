package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukx {
    private static final xze a = xze.g("Bugle", "CmsMessagesToTelephonyPersister");
    private final armf b;
    private final armf c;
    private final armf d;
    private final wzs e;
    private final Context f;
    private final vqu g;
    private final yjy h;
    private final tqx i;
    private final rtb j;
    private final msk k;
    private final armf l;
    private final armf m;

    static {
        uuh.x(227918773, "use_sms_telephony_uri_for_sms_messages");
    }

    public ukx(armf armfVar, armf armfVar2, armf armfVar3, wzs wzsVar, vqu vquVar, yjy yjyVar, tqx tqxVar, rtb rtbVar, msk mskVar, Context context, armf armfVar4, armf armfVar5) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = wzsVar;
        this.g = vquVar;
        this.h = yjyVar;
        this.f = context;
        this.i = tqxVar;
        this.j = rtbVar;
        this.k = mskVar;
        this.l = armfVar4;
        this.m = armfVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri a(MessagesTable.BindData bindData, alog alogVar) {
        alsx alsxVar;
        String O;
        boolean cD;
        Uri uri;
        String O2;
        String str;
        String ad;
        gt gtVar;
        byte[] bArr;
        MessageCoreData a2 = this.i.a();
        a2.bM(bindData);
        int i = 0;
        while (true) {
            alsxVar = (alsx) alogVar;
            if (i >= alsxVar.c) {
                break;
            }
            a2.aH(this.j.g((PartsTable.BindData) alogVar.get(i)));
            i++;
        }
        String aw = a2.aw();
        smr q = ((rtz) this.c.b()).q(a2.z());
        ParticipantsTable.BindData a3 = ((rxq) this.b.b()).a(aw);
        a3.getClass();
        bindData.z();
        q.getClass();
        if (((Boolean) new msu(0).get()).booleanValue()) {
            O = this.k.s(a3).n();
        } else {
            O = a3.O();
        }
        if (!((orj) this.l.b()).a() && !((orl) this.m.b()).a()) {
            cD = a2.cP();
        } else {
            cD = a2.cD();
        }
        if (!cD) {
            O.getClass();
        }
        long n = a2.n();
        long q2 = a2.q();
        xhv F = q.F();
        int c = this.h.c();
        int d = a2.d();
        Uri uri2 = null;
        int i2 = 1;
        if (d != 0) {
            if (d == 1 || d == 3 || d == 7) {
                long cE = yyb.cE(F);
                if (cD) {
                    ConversationIdType z = a2.z();
                    aknw aknwVar = new aknw(null);
                    aknwVar.b = this.g.U(a2);
                    ArrayList b = ((rus) this.d.b()).b(z, true);
                    String aq = a2.aq();
                    if (!TextUtils.isEmpty(aq)) {
                        bArr = aq.getBytes(StandardCharsets.US_ASCII);
                    } else {
                        bArr = null;
                    }
                    uri = null;
                    gv ai = this.e.ai((String[]) b.toArray(new String[0]), a2, aknwVar, 604800L, a2.b(), n, bArr);
                    ai.getClass();
                    Uri l = this.e.l(this.f, ai, c, null, cE, null);
                    if (l != null) {
                        uri2 = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(l));
                    }
                    uri2 = uri;
                } else {
                    uri = null;
                    O.getClass();
                    try {
                        gt gtVar2 = new gt();
                        gtVar2.b(new gi(O));
                        if (!TextUtils.isEmpty(a2.ap())) {
                            gtVar2.i(new gi(a2.ap()));
                        }
                        gtVar2.b = this.g.U(a2);
                        gtVar2.h(q2 / 1000);
                        gtVar2.k(new byte[0]);
                        if (a2.cI()) {
                            gtVar2.g();
                        }
                        String aq2 = a2.aq();
                        if (!TextUtils.isEmpty(aq2)) {
                            gtVar2.k(aq2.getBytes());
                        }
                        gtVar = gtVar2;
                    } catch (gk unused) {
                        gtVar = null;
                    }
                    gtVar.getClass();
                    Uri k = this.e.k(this.f, gtVar, c, null, cE, n / 1000, null);
                    if (k != null) {
                        uri2 = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(k));
                    }
                    uri2 = uri;
                }
            }
        } else {
            uri = null;
            if (!alogVar.isEmpty()) {
                if (alsxVar.c <= 1) {
                    List K = ((rtz) this.c.b()).K(q.x());
                    boolean booleanValue = ((Boolean) new msu(0).get()).booleanValue();
                    if (q.h() != 0) {
                        if (booleanValue) {
                            alog n2 = alog.n(K);
                            msk mskVar = this.k;
                            ArrayList arrayList = new ArrayList(n2.size());
                            int size = n2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.add(mskVar.s((ParticipantsTable.BindData) n2.get(i3)).n());
                            }
                            str = TextUtils.join(" ", alog.n(arrayList));
                        } else {
                            str = rxn.w(K);
                        }
                        d.t(!TextUtils.isEmpty(str), "Not able to get participants for mass text SMS");
                    } else if (!K.isEmpty()) {
                        if (((alsx) K).c <= 1) {
                            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) K.get(0);
                            if (booleanValue) {
                                O2 = this.k.q(bindData2).n();
                            } else {
                                O2 = bindData2.O();
                            }
                            bindData2.M();
                            O2.getClass();
                            str = O2;
                        } else {
                            throw new IllegalArgumentException(String.format("1: 1 conversation has more than one participants, conversation id = %s", q.x()));
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("1:1 conversation does not have participant, conversation id = %s", q.x()));
                    }
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((MessageData) a2).i.get(0);
                    UUID aE = a2.aE();
                    Optional Z = a2.Z();
                    if (messagePartCoreData.ad() == null) {
                        xyo e = a.e();
                        e.H("MessagePartCoreData's text is null! Continuing with empty part data.");
                        e.z("draftId", aE);
                        e.y("sentTimestamp", q2);
                        e.y("receivedTimestampInMs", n);
                        e.z("threadId", F);
                        e.q();
                        ad = "";
                    } else {
                        ad = messagePartCoreData.ad();
                        ad.getClass();
                    }
                    wzs wzsVar = this.e;
                    Context context = this.f;
                    if (true == cD) {
                        i2 = 2;
                    }
                    Uri ag = wzsVar.ag(context, Telephony.Sms.CONTENT_URI, c, str, ad, n, 0, i2, F, Z);
                    if (ag != null) {
                        this.e.P(ag, 0, q2);
                        uri2 = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(ag));
                    }
                    uri2 = uri;
                } else {
                    throw new IllegalArgumentException("More than 1 part provided for an SMS message.");
                }
            } else {
                throw new IllegalArgumentException("No parts provided for SMS message");
            }
        }
        if (uri2 != null && bindData.q() >= 100 && bindData.q() <= 115) {
            this.e.ad(uri2, bindData.t());
        }
        return uri2;
    }
}
