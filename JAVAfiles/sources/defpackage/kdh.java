package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter");
    public final arwe b;
    public final mjg c;
    public final pkl d;
    public final arqr e;
    private final Context f;
    private final armf g;
    private final pke h;
    private final wpm i;

    public kdh(arwe arweVar, Context context, mjg mjgVar, wpm wpmVar, armf armfVar, pke pkeVar, pkl pklVar) {
        arweVar.getClass();
        context.getClass();
        mjgVar.getClass();
        wpmVar.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.f = context;
        this.c = mjgVar;
        this.i = wpmVar;
        this.g = armfVar;
        this.h = pkeVar;
        this.d = pklVar;
        this.e = qkf.f(new jya(this, 5, (boolean[]) null), arweVar);
    }

    public static final int c(miz mizVar) {
        if ((mizVar.e() instanceof myt) && lga.bU(mizVar)) {
            return 3;
        }
        if (lga.bV(mizVar)) {
            return 2;
        }
        return 1;
    }

    public final qkg a(arwe arweVar, kde kdeVar) {
        nbv q;
        mxf mxfVar;
        myz fl;
        myz fl2;
        mym e = kdeVar.a.e();
        boolean z = e instanceof mxf;
        if ((!z || (e instanceof myt)) && (!z || (fl2 = ((mxf) e).fl()) == null || !fl2.f)) {
            miz mizVar = kdeVar.a;
            if (!(mizVar instanceof mty) && (((q = mizVar.q()) == null || q.h != 2) && (!((odq) this.g.b()).a() || !((wpn) this.i.b.c()).a()))) {
                if (z) {
                    mxfVar = (mxf) e;
                } else {
                    mxfVar = null;
                }
                if (mxfVar != null && (fl = mxfVar.fl()) != null) {
                    if (!fl.b) {
                        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createUiDataFlow", 94, "ProgressBarOverlayUiAdapter.kt")).t("Not transferring for messageId=%s", kdeVar.a.b());
                        if (!((ansy) ((pjl) this.h).a.b()).e("bugle.hide_resumable_progressbar_for_sender") || lga.bU(kdeVar.a)) {
                            return new qjp(new kdg(this, kdeVar, 1));
                        }
                    } else {
                        if (!adom.t(this.f)) {
                            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createUiDataFlow", 103, "ProgressBarOverlayUiAdapter.kt")).t("No network is available for messageId=%s", kdeVar.a.b());
                            return new qjp(new kdg(this, kdeVar, 0));
                        }
                        ncq ncqVar = fl.a;
                        ncqVar.getClass();
                        return new qki(new jdn(lga.at(ncqVar, arweVar).a(), this, kdeVar, 6, null), null, 1);
                    }
                }
            }
        }
        return null;
    }

    public final aeve b(kde kdeVar, String str, arqg arqgVar) {
        int c = c(kdeVar.a);
        if (this.d.a()) {
            if (str == null) {
                str = this.f.getString(R.string.message_bubble_manual_download);
                str.getClass();
            }
        } else {
            str = this.f.getString(R.string.message_bubble_manual_download);
            str.getClass();
        }
        return new aeve(c, new aevh(str, new jfq(this, arqgVar, kdeVar, 18, (char[]) null)));
    }
}
