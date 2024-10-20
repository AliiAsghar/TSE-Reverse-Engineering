package defpackage;

import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwp implements ahwq {
    private static final Pattern a = Pattern.compile("^[\\p{L}\\p{N}]+$");
    private final String b = "/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto".concat("_");

    @Override // defpackage.ahwq
    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (a.matcher(obj2).matches()) {
            String str = this.b;
            Objects.toString(obj);
            return str.concat(String.valueOf(obj));
        }
        throw new IllegalArgumentException("Invalid key: ".concat(String.valueOf(obj2)));
    }
}
