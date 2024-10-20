package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsc implements qrt {
    private final Map a;
    private final /* synthetic */ int b;

    public qsc(xbe xbeVar, xbi xbiVar, int i) {
        this.b = i;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("MMS_ENABLED", String.valueOf(xbeVar.r()));
        hashMap.put("GROUP_MMS_ENABLED", String.valueOf(xbiVar.d(xbeVar.a)));
        hashMap.put("MAX_MESSAGE_SIZE", String.valueOf(xbeVar.d()));
        hashMap.put("MAX_TEXT_LENGTH", String.valueOf(xbeVar.f()));
        hashMap.put("MAX_SUBJECT_LENGTH", String.valueOf(xbeVar.e()));
        hashMap.put("SUPPORTS_MMS_PRIORITY", String.valueOf(xbeVar.y()));
        hashMap.put("SUPPORTS_FILE_TRANSFER", "true");
        hashMap.put("EMAIL_GATEWAY", xbeVar.j());
        hashMap.put("EMAIL_SMS_TO_MMS_THRESHOLD", String.valueOf(xbeVar.a()));
    }

    @Override // defpackage.qrt
    public final String a(String str) {
        if (this.b != 0) {
            return (String) this.a.get(str);
        }
        return (String) this.a.get(str);
    }

    public qsc(xbe xbeVar, int i, boolean z, int i2) {
        this.b = i2;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        int h = xbeVar.h();
        hashMap.put("SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", String.valueOf(h == -1 ? Integer.MAX_VALUE : h));
        hashMap.put("SMS_MAX_TEXT_PARTS", String.valueOf(i == -1 ? Integer.MAX_VALUE : i));
        hashMap.put("SIMPLE_CHARACTERS_ONLY", String.valueOf(z));
    }
}
