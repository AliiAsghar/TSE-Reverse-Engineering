package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqd extends arrp implements arqr {
    private final /* synthetic */ int s;
    public static final mqd r = new mqd(20);
    public static final mqd q = new mqd(19);
    public static final mqd p = new mqd(18);
    public static final mqd o = new mqd(17);
    public static final mqd n = new mqd(16);
    public static final mqd m = new mqd(14);
    public static final mqd l = new mqd(11);
    public static final mqd k = new mqd(10);
    public static final mqd j = new mqd(9);
    public static final mqd i = new mqd(8);
    public static final mqd h = new mqd(7);
    public static final mqd g = new mqd(6);
    public static final mqd f = new mqd(5);
    public static final mqd e = new mqd(4);
    public static final mqd d = new mqd(3);
    public static final mqd c = new mqd(2);
    public static final mqd b = new mqd(1);
    public static final mqd a = new mqd(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqd(int i2) {
        super(1);
        this.s = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.s) {
            case 0:
                return new BugleConversationId(((smr) obj).x());
            case 1:
                return lgc.G(obj);
            case 2:
                ((msh) obj).getClass();
                return false;
            case 3:
                return null;
            case 4:
                aozy builder = ((qlo) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qlo qloVar = (qlo) builder.b;
                qloVar.b |= 8;
                qloVar.g = false;
                return (qlo) builder.s();
            case 5:
                return d.ak((Cursor) obj);
            case 6:
                return d.ak((Cursor) obj);
            case 7:
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                return new qmk(cursor.getLong(0), cursor.getLong(1));
            case 8:
                Cursor cursor2 = (Cursor) obj;
                cursor2.getClass();
                return new qmk(cursor2.getLong(0), cursor2.getLong(1));
            case 9:
                return d.ak((Cursor) obj);
            case 10:
                return d.ak((Cursor) obj);
            case 11:
                Cursor cursor3 = (Cursor) obj;
                cursor3.getClass();
                long j2 = cursor3.getLong(0);
                Instant ofEpochMilli = Instant.ofEpochMilli(cursor3.getLong(1));
                ofEpochMilli.getClass();
                return new qll(j2, ofEpochMilli);
            case 12:
                Cursor cursor4 = (Cursor) obj;
                cursor4.getClass();
                long j3 = cursor4.getLong(0);
                int i2 = cursor4.getInt(1);
                String string = cursor4.getString(2);
                List B = aqjn.B(Long.valueOf(j3), Integer.valueOf(i2), string);
                if (!B.isEmpty()) {
                    Iterator it = B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                if (((Boolean) qlb.c.e()).booleanValue()) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                string.getClass();
                return new qlt(j3, i2, string);
            case 13:
                Cursor cursor5 = (Cursor) obj;
                cursor5.getClass();
                long j4 = cursor5.getLong(0);
                String string2 = cursor5.getString(1);
                String string3 = cursor5.getString(2);
                String string4 = cursor5.getString(3);
                if (string2 == null) {
                    return null;
                }
                return new qlw(j4, string2, string3, string4);
            case 14:
                return d.ak((Cursor) obj);
            case 15:
                Cursor cursor6 = (Cursor) obj;
                cursor6.getClass();
                long j5 = cursor6.getLong(cursor6.getColumnIndexOrThrow("contact_id"));
                long j6 = cursor6.getLong(cursor6.getColumnIndexOrThrow("_id"));
                String string5 = cursor6.getString(cursor6.getColumnIndexOrThrow("mimetype"));
                Long valueOf = Long.valueOf(j5);
                string5.getClass();
                return new armo(valueOf, new qml(j6, string5));
            case 16:
                return d.ak((Cursor) obj);
            case 17:
                return d.ak((Cursor) obj);
            case 18:
                Cursor cursor7 = (Cursor) obj;
                cursor7.getClass();
                long j7 = cursor7.getLong(0);
                Instant ofEpochMilli2 = Instant.ofEpochMilli(cursor7.getLong(1));
                ofEpochMilli2.getClass();
                return new qll(j7, ofEpochMilli2);
            case 19:
                return qno.c(obj);
            default:
                return qno.c(obj);
        }
    }
}
