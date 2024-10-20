package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpu {
    public static ajpu c(String str) {
        if (str.startsWith("sip:")) {
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.m(str);
            atkvVar.n(2);
            return atkvVar.l();
        }
        if (str.startsWith("tel:")) {
            atkv atkvVar2 = new atkv((byte[]) null);
            atkvVar2.m(str.substring(4));
            atkvVar2.n(1);
            return atkvVar2.l();
        }
        throw new IllegalArgumentException("URI format not supported");
    }

    public abstract String a();

    public abstract int b();

    public final String toString() {
        String str;
        String format = String.format("id=%s", advq.PHONE_NUMBER.c(a()));
        if (b() != 1) {
            str = "SIP_URI";
        } else {
            str = "PHONE";
        }
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(format, String.format("type=%s", str))));
    }
}
