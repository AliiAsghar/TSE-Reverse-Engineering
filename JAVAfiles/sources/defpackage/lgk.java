package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgk extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final lgk t = new lgk(20);
    public static final lgk s = new lgk(19);
    public static final lgk r = new lgk(18);
    public static final lgk q = new lgk(17);
    public static final lgk p = new lgk(16);
    public static final lgk o = new lgk(15);
    public static final lgk n = new lgk(14);
    public static final lgk m = new lgk(12);
    public static final lgk l = new lgk(11);
    public static final lgk k = new lgk(10);
    public static final lgk j = new lgk(9);
    public static final lgk i = new lgk(8);
    public static final lgk h = new lgk(7);
    public static final lgk g = new lgk(6);
    public static final lgk f = new lgk(5);
    public static final lgk e = new lgk(4);
    public static final lgk d = new lgk(3);
    public static final lgk c = new lgk(2);
    public static final lgk b = new lgk(1);
    public static final lgk a = new lgk(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgk(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        String str = null;
        switch (this.u) {
            case 0:
                ((aeoj) obj).getClass();
                return arnb.a;
            case 1:
                return d.Z(obj);
            case 2:
                ((aeoj) obj).getClass();
                return arnb.a;
            case 3:
                return d.Z(obj);
            case 4:
                return d.Z(obj);
            case 5:
                return d.Z(obj);
            case 6:
                return d.Z(obj);
            case 7:
                lhr lhrVar = (lhr) obj;
                lhrVar.getClass();
                return "list_".concat(lhrVar.a);
            case 8:
                return a.ax(obj);
            case 9:
                return null;
            case 10:
                lji ljiVar = (lji) obj;
                ljiVar.getClass();
                return ljiVar.b();
            case 11:
                return null;
            case 12:
                return d.ak((Cursor) obj);
            case 13:
                ltd ltdVar = (ltd) obj;
                ltdVar.getClass();
                ltdVar.a();
                return arnb.a;
            case 14:
                msh mshVar = (msh) obj;
                mshVar.getClass();
                Optional e2 = mshVar.e();
                e2.getClass();
                qei qeiVar = (qei) arsd.k(e2);
                if (qeiVar != null) {
                    str = qeiVar.d;
                }
                if (str != null) {
                    StringBuilder reverse = new StringBuilder((CharSequence) arsd.Z(str, "+", "")).reverse();
                    reverse.getClass();
                    return reverse.toString();
                }
                throw new IllegalArgumentException("Required value was null.");
            case 15:
                return Boolean.valueOf(obj instanceof BugleConversationId);
            case 16:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 17:
                ConversationId conversationId = (ConversationId) obj;
                conversationId.getClass();
                return new RbmConversationId(((BugleConversationId) conversationId).a);
            case 18:
                return lgc.G(obj);
            case 19:
                return lgc.G(obj);
            default:
                return lgc.G(obj);
        }
    }
}
