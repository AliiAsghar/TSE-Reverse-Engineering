package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.toolstone.ConversationToolstoneView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzq extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        armf armfVar = null;
        akvv aagqVar = null;
        switch (this.b) {
            case 0:
                this.a.a();
                return arnb.a;
            case 1:
                ((zoh) ((yyz) this.a).e).a();
                return arnb.a;
            case 2:
                this.a.a();
                return arnb.a;
            case 3:
                this.a.a();
                return arnb.a;
            case 4:
                this.a.a();
                return arnb.a;
            case 5:
                ((zzt) this.a).f.a();
                return arnb.a;
            case 6:
                return Integer.valueOf(this.a.size());
            case 7:
                Object obj = this.a;
                if (obj != null) {
                    ((aehz) obj).j.a();
                }
                return arnb.a;
            case 8:
                ConversationToolstoneView conversationToolstoneView = (ConversationToolstoneView) this.a;
                MessageIdType u = conversationToolstoneView.e.u();
                u.getClass();
                armf armfVar2 = conversationToolstoneView.d;
                if (armfVar2 == null) {
                    arro.b("toolstoneDatabaseOperations");
                } else {
                    armfVar = armfVar2;
                }
                ((ahmv) armfVar.b()).c(u);
                return arnb.a;
            case 9:
                Object obj2 = this.a;
                int f = ((ConversationToolstoneView) obj2).e.f();
                if (f != 232) {
                    if (f == 251) {
                        aagqVar = new wpo();
                    }
                } else {
                    aagqVar = new aagq();
                }
                aktp.L(aagqVar, (View) obj2);
                return arnb.a;
            case 10:
                return ((aahp) this.a).e;
            case 11:
                ((aanw) this.a).c(false);
                return arnb.a;
            case 12:
                ((aanw) this.a).c(true);
                return arnb.a;
            case 13:
                aanw aanwVar = (aanw) this.a;
                aanwVar.b(new ehx(aanwVar, (arpe) null, 7));
                return arnb.a;
            case 14:
                aanw aanwVar2 = (aanw) this.a;
                aanwVar2.b(new ehx(aanwVar2, (arpe) null, 8, (byte[]) null));
                return arnb.a;
            case 15:
                aanw aanwVar3 = (aanw) this.a;
                aanwVar3.b(new ehx(aanwVar3, (arpe) null, 9, (char[]) null));
                return arnb.a;
            case 16:
                Map map = ((aanw) this.a).c;
                map.getClass();
                return new aans(map);
            case 17:
                cj fe = ((aanx) ((aaoc) this.a).a).fe();
                if (fe != null) {
                    fe.finish();
                }
                return arnb.a;
            case 18:
                return this.a;
            case 19:
                return ((zzq) this.a).a;
            default:
                return dyt.d(this.a).aL();
        }
    }
}
