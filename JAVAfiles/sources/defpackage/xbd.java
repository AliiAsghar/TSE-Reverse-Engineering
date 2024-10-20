package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbd {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/sms/config/HiddenContacts");
    public final List a;

    private xbd(List list) {
        xyl.k(!list.isEmpty());
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.xbd a(int r26, java.lang.String r27, defpackage.yjy r28) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbd.a(int, java.lang.String, yjy):xbd");
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    public final wyj b(msh mshVar) {
        if (!mshVar.x(((Boolean) new mss(1).get()).booleanValue())) {
            String o = mshVar.o(((Boolean) new mss(1).get()).booleanValue());
            if (o == null) {
                return null;
            }
            int length = o.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                int digit = Character.digit(o.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                try {
                    long parseLong = Long.parseLong(sb2);
                    loop1: for (wyj wyjVar : this.a) {
                        if (!((Optional) wyjVar.b).isEmpty()) {
                            Iterator it = wyjVar.a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    xbc xbcVar = (xbc) it.next();
                                    if (parseLong >= xbcVar.a && parseLong <= xbcVar.b) {
                                        break loop1;
                                    }
                                } else if (mshVar.equals(((Optional) wyjVar.b).get())) {
                                }
                            }
                            return wyjVar;
                        }
                    }
                    return null;
                } catch (NumberFormatException unused) {
                    alvw i2 = b.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 217, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", o);
                    return null;
                }
            }
            alvw i3 = b.i();
            i3.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 210, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", o);
            return null;
        }
        alvw i4 = b.i();
        i4.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 198, "HiddenContacts.java")).q("HiddenContacts: invalid input number (empty)");
        return null;
    }
}
