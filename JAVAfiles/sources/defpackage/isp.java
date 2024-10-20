package defpackage;

import android.content.Context;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isp implements akgh<zxk> {
    final /* synthetic */ itb a;

    public isp(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xzb.p("Bugle", th, "Error getting conversation scale enabled state");
        itb itbVar = this.a;
        MessageListRecyclerView messageListRecyclerView = itbVar.ao;
        if (messageListRecyclerView == null) {
            return;
        }
        cg cgVar = itbVar.f;
        itf E = messageListRecyclerView.E();
        Context x = cgVar.x();
        x.getClass();
        E.a = new ScaleGestureDetector(x, (ScaleGestureDetector.OnScaleGestureListener) this.a.y.b());
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zxk zxkVar = (zxk) obj;
        MessageListRecyclerView messageListRecyclerView = this.a.ao;
        if (messageListRecyclerView == null) {
            return;
        }
        if (zxkVar.d) {
            itf E = messageListRecyclerView.E();
            Context x = this.a.f.x();
            x.getClass();
            E.a = new ScaleGestureDetector(x, (ScaleGestureDetector.OnScaleGestureListener) this.a.y.b());
            return;
        }
        messageListRecyclerView.E().a = null;
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
