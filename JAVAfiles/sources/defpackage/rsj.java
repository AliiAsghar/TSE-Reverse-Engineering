package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsj extends xzs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ rsr a;
    private final boolean c;
    private final rsk k;
    private final String l;
    private final List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsj(rsr rsrVar, boolean z, rsk rskVar, rrc rrcVar) {
        super("Bugle.Async.Compose.DraftMessageData.checkDraftForAction.Duration");
        this.a = rsrVar;
        this.c = z;
        this.k = rskVar;
        this.l = rrcVar.b();
        this.m = new ArrayList(rsrVar.q);
        rsrVar.v = this;
    }

    @Override // defpackage.xzs
    public final /* synthetic */ Object a(Object[] objArr) {
        rsr rsrVar;
        akrh e;
        rsq rsqVar;
        int size;
        akrh e2 = aktp.e("CheckDraftForSendTask::doInBackgroundTimed");
        try {
            try {
                if (this.c) {
                    xyl.h();
                    if (((Boolean) vof.a.e()).booleanValue()) {
                        size = (int) Collection.EL.stream(this.m).filter(new rsi(3)).count();
                    } else {
                        size = this.m.size();
                    }
                    if (size <= this.a.l()) {
                        rsr rsrVar2 = this.a;
                        if (rsrVar2.g) {
                            int b2 = rsrVar2.A.b(-1);
                            Iterator it = this.m.iterator();
                            while (it.hasNext()) {
                                if (((MessagePartCoreData) it.next()).n() > b2) {
                                }
                            }
                        } else {
                            wyo b3 = rsrVar2.B.b(this.m, rsrVar2.n);
                            if (b3.a()) {
                                xyo c = rsr.a.c();
                                c.H("Draft is over MMS limit after compression.");
                                c.y("required", b3.a);
                                c.y("max", b3.b);
                                c.l(this.a.n);
                                c.q();
                            }
                        }
                        e2.close();
                        return rsqVar;
                    }
                    rsqVar = rsq.MESSAGE_OVER_LIMIT;
                    e2.close();
                    return rsqVar;
                }
                if (!rsrVar.g) {
                    boolean ab = rsrVar.ab();
                    rsr rsrVar3 = this.a;
                    xbe a = rsrVar3.x.a(rsrVar3.n);
                    rsr rsrVar4 = this.a;
                    String str = rsrVar4.k;
                    xbi xbiVar = rsrVar4.y;
                    if (!xbiVar.f.x(rsrVar4.n).q(xbiVar.c.getResources().getString(R.string.sms_7bit_confirmed_pref_key), false) && !TextUtils.isEmpty(str) && !ab && a.w()) {
                        rsr rsrVar5 = this.a;
                        if (rsrVar5.y.e(rsrVar5.n)) {
                            rsr rsrVar6 = this.a;
                            if (!str.equals(rsrVar6.C.a(rsrVar6.z, str))) {
                                rsqVar = rsq.NEED_TO_CONFIRM_SMS_ENCODING;
                                e2.close();
                                return rsqVar;
                            }
                        }
                    }
                }
                lua luaVar = this.a.w;
                if (luaVar == null) {
                    e.close();
                } else {
                    sxy d = MessagesTable.d();
                    d.w("isReplyToMissingMessage");
                    d.g(new rsc(luaVar, 2));
                    boolean M = d.b().M();
                    e.close();
                    if (M) {
                        rsqVar = rsq.IS_REPLY_TO_MISSING_MESSAGE;
                        e2.close();
                        return rsqVar;
                    }
                }
                rsqVar = rsq.PASSED;
                e2.close();
                return rsqVar;
            } finally {
            }
            rsrVar = this.a;
            e = aktp.e("CheckDraftForSendTask#isReplyToMissingMessage");
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xzs
    public final /* synthetic */ void d(Object obj) {
        rsq rsqVar = (rsq) obj;
        akrh e = aktp.e("CheckDraftForSendTask::doPostExecute");
        try {
            rsr rsrVar = this.a;
            rsrVar.v = null;
            if (rsrVar.i(this.l) && !isCancelled()) {
                this.k.a(this.a, rsqVar);
            } else {
                if (!this.a.i(this.l)) {
                    rsr.a.q("Message can't be sent: draft not bound.");
                }
                if (isCancelled()) {
                    rsr.a.q("Message can't be sent: draft is cancelled.");
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        this.a.v = null;
    }
}
