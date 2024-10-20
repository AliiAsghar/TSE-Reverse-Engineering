package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ebm(int i, MessageId messageId, int i2) {
        this.c = i2;
        this.a = i;
        this.b = messageId;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [yan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        tqi tqiVar;
        int i = 2;
        switch (this.c) {
            case 0:
                ((dzm) this.b).a(this.a);
                return;
            case 1:
                ((eal) this.b).a(this.a);
                return;
            case 2:
                int i2 = this.a;
                fai faiVar = (fai) this.b;
                faiVar.a[i2].eL();
                fbt fbtVar = faiVar.i;
                fbtVar.F(fbtVar.E(), 1033, new fbn(4));
                return;
            case 3:
                ((ggs) this.b).a.r(this.a, "Selection-Changed");
                return;
            case 4:
                ykw ykwVar = (ykw) ((laj) this.b).j.b();
                int d = ykwVar.d("max_conversation_count", 0);
                int i3 = this.a;
                if (i3 > d) {
                    ykwVar.j("max_conversation_count", i3);
                    return;
                }
                return;
            case 5:
                tbt tbtVar = new tbt();
                tbtVar.aj("CoreBugleMessageRepository#updateMediaDisplayState");
                int i4 = this.a - 1;
                if (i4 != 1) {
                    if (i4 != 2) {
                        tqiVar = tqi.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP;
                    } else {
                        tqiVar = tqi.POSITIVE_VERDICT_HIDE_IMAGE;
                    }
                } else {
                    tqiVar = tqi.POSITIVE_VERDICT_DISPLAY_IMAGE;
                }
                Object obj = this.b;
                tbtVar.k(tqiVar);
                tbtVar.v(new mtl(obj, 6));
                tbtVar.a().e();
                return;
            case 6:
                ((xwg) ((ngr) this.b).g.b()).a(this.a, 2);
                return;
            case 7:
                qyf qyfVar = (qyf) this.b;
                ((rtz) qyfVar.b.b()).V(qyfVar.a, new ParticipantColor(0, this.a, 0));
                return;
            case 8:
                int i5 = this.a;
                Context context = ((rys) this.b).a;
                Toast.makeText(context, context.getString(i5), 1).show();
                return;
            case 9:
                int i6 = this.a;
                vbu vbuVar = (vbu) this.b;
                vbu.g(vbuVar.j(i6, false)).ifPresent(new ivb(i6, i));
                vbuVar.h.set(null);
                return;
            case 10:
                this.b.b(this.a);
                return;
            case 11:
                yav yavVar = (yav) this.b;
                Iterator it = yavVar.n.iterator();
                while (it.hasNext()) {
                    qjb.a(new ebm((yan) it.next(), this.a, 10), yavVar.h);
                }
                return;
            case 12:
                snf e = sni.e();
                e.w("logSpamFolderOpened");
                e.h(new ybe(18));
                ((ynf) ((zai) this.b).b.b()).b(new yne(this.a, e.b().i(), 0));
                return;
            case 13:
                int i7 = this.a;
                Object obj2 = this.b;
                try {
                    try {
                        if (((aava) obj2).f) {
                            if (((aava) obj2).i != null) {
                                ((aava) obj2).e();
                            }
                            ((aava) obj2).f(i7);
                        }
                    } catch (RuntimeException e2) {
                        alwl alwlVar = (alwl) aava.a.h();
                        alwlVar.X(aawh.a, Integer.valueOf(i7));
                        ((alwl) ((alwl) alwlVar.g(e2)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "selectCameraByIndex", 471, "CameraManager.java")).q("RuntimeException in CameraManager.selectCameraByIndex");
                    }
                    return;
                } finally {
                    ((aava) obj2).r.set(false);
                }
            case 14:
                ((absl) this.b).h(this.a);
                return;
            case 15:
                ((adtr) this.b).n(this.a);
                return;
            case 16:
                agso agsoVar = (agso) this.b;
                agsoVar.g();
                agsoVar.h(this.a - 1);
                return;
            case 17:
                ((ahqe) this.b).a(this.a + 1);
                return;
            case 18:
                aizi aiziVar = (aizi) this.b;
                aiziVar.e.b(aiziVar.b, this.a);
                return;
            case 19:
                ajax ajaxVar = (ajax) this.b;
                ajaw ajawVar = ajaxVar.a;
                if (ajawVar != null) {
                    ajawVar.a(this.a);
                    ajaxVar.a = null;
                    return;
                }
                return;
            default:
                ajax ajaxVar2 = (ajax) this.b;
                ajaw ajawVar2 = ajaxVar2.a;
                if (ajawVar2 != null) {
                    ajawVar2.a(this.a);
                    ajaxVar2.a = null;
                    return;
                }
                return;
        }
    }

    public ebm(absl abslVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = abslVar;
    }

    public /* synthetic */ ebm(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public ebm(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
