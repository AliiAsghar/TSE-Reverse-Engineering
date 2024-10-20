package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laz implements lay {
    private final aksr a;
    private final /* synthetic */ int b;
    private final lbb c;

    public laz(Context context, aksr aksrVar, atal atalVar, int i, byte[] bArr) {
        this.b = i;
        this.a = aksrVar;
        this.c = new lau(context, atalVar, R.attr.colorPrimary, R.attr.colorOnPrimary);
    }

    @Override // defpackage.lay
    public final lbb a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return this.c;
            }
            return this.c;
        }
        return this.c;
    }

    @Override // defpackage.lay
    public final void b(oo ooVar, SelectedConversation selectedConversation) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                akrc b = this.a.b("SwipeMarkAsUnreadHandler");
                try {
                    aktp.L(new aahx(selectedConversation.a, !selectedConversation.s), ooVar.a);
                    b.close();
                    return;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            akrc b2 = this.a.b("SwipeArchiveHandler");
            try {
                aktp.L(new aahv(alog.r(selectedConversation.a), amfe.CONVERSATION_FROM_LIST_SWIPE), ooVar.a);
                b2.close();
                return;
            } catch (Throwable th3) {
                try {
                    b2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        akrc b3 = this.a.b("SwipeDeleteHandler");
        try {
            aktp.L(new aahw(selectedConversation, amfe.CONVERSATION_FROM_LIST_SWIPE), ooVar.a);
            b3.close();
        } catch (Throwable th5) {
            try {
                b3.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public laz(Context context, aksr aksrVar, atal atalVar, int i) {
        this.b = i;
        this.a = aksrVar;
        this.c = new lau(context, atalVar, R.attr.colorError, R.attr.colorOnError);
    }

    public laz(Context context, aksr aksrVar, atal atalVar, atal atalVar2, int i) {
        this.b = i;
        this.a = aksrVar;
        this.c = new lba(context, atalVar, atalVar2, new ivj(atalVar, atalVar2, 6));
    }
}
