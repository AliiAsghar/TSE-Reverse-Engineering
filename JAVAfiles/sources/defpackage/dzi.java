package defpackage;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzi {
    private final CharSequence a;
    private final long b;
    private final dzv c;
    private final Bundle d = new Bundle();
    private String e;
    private Uri f;

    public dzi(CharSequence charSequence, long j, dzv dzvVar) {
        this.a = charSequence;
        this.b = j;
        this.c = dzvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List b(android.os.Parcelable[] r18) {
        /*
            r0 = r18
            java.lang.String r1 = "uri"
            java.lang.String r2 = "extras"
            java.lang.String r3 = "type"
            java.lang.String r4 = "sender"
            java.lang.String r5 = "sender_person"
            java.lang.String r6 = "person"
            java.lang.String r7 = "time"
            java.lang.String r8 = "text"
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r0.length
            r9.<init>(r10)
            r10 = 0
        L19:
            int r11 = r0.length
            if (r10 >= r11) goto Lc5
            r11 = r0[r10]
            boolean r12 = r11 instanceof android.os.Bundle
            if (r12 == 0) goto Lb9
            android.os.Bundle r11 = (android.os.Bundle) r11
            r12 = 0
            boolean r13 = r11.containsKey(r8)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto Laf
            boolean r13 = r11.containsKey(r7)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 != 0) goto L33
            goto Laf
        L33:
            boolean r13 = r11.containsKey(r6)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L42
            android.os.Bundle r13 = r11.getBundle(r6)     // Catch: java.lang.ClassCastException -> Laf
            dzv r13 = defpackage.dzv.b(r13)     // Catch: java.lang.ClassCastException -> Laf
            goto L74
        L42:
            boolean r13 = r11.containsKey(r5)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L5b
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> Laf
            r14 = 28
            if (r13 < r14) goto L5b
            android.os.Parcelable r13 = r11.getParcelable(r5)     // Catch: java.lang.ClassCastException -> Laf
            android.app.Person r13 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m(r13)     // Catch: java.lang.ClassCastException -> Laf
            dzv r13 = defpackage.dyf.c(r13)     // Catch: java.lang.ClassCastException -> Laf
            goto L74
        L5b:
            boolean r13 = r11.containsKey(r4)     // Catch: java.lang.ClassCastException -> Laf
            if (r13 == 0) goto L73
            dzu r13 = new dzu     // Catch: java.lang.ClassCastException -> Laf
            r13.<init>()     // Catch: java.lang.ClassCastException -> Laf
            java.lang.CharSequence r14 = r11.getCharSequence(r4)     // Catch: java.lang.ClassCastException -> Laf
            r13.a = r14     // Catch: java.lang.ClassCastException -> Laf
            dzv r14 = new dzv     // Catch: java.lang.ClassCastException -> Laf
            r14.<init>(r13)     // Catch: java.lang.ClassCastException -> Laf
            r13 = r14
            goto L74
        L73:
            r13 = r12
        L74:
            dzi r14 = new dzi     // Catch: java.lang.ClassCastException -> Laf
            java.lang.CharSequence r15 = r11.getCharSequence(r8)     // Catch: java.lang.ClassCastException -> Laf
            r16 = r4
            r17 = r5
            long r4 = r11.getLong(r7)     // Catch: java.lang.ClassCastException -> Lb3
            r14.<init>(r15, r4, r13)     // Catch: java.lang.ClassCastException -> Lb3
            boolean r4 = r11.containsKey(r3)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto L9e
            boolean r4 = r11.containsKey(r1)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto L9e
            java.lang.String r4 = r11.getString(r3)     // Catch: java.lang.ClassCastException -> Lb3
            android.os.Parcelable r5 = r11.getParcelable(r1)     // Catch: java.lang.ClassCastException -> Lb3
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> Lb3
            r14.d(r4, r5)     // Catch: java.lang.ClassCastException -> Lb3
        L9e:
            boolean r4 = r11.containsKey(r2)     // Catch: java.lang.ClassCastException -> Lb3
            if (r4 == 0) goto Lad
            android.os.Bundle r4 = r14.d     // Catch: java.lang.ClassCastException -> Lb3
            android.os.Bundle r5 = r11.getBundle(r2)     // Catch: java.lang.ClassCastException -> Lb3
            r4.putAll(r5)     // Catch: java.lang.ClassCastException -> Lb3
        Lad:
            r12 = r14
            goto Lb3
        Laf:
            r16 = r4
            r17 = r5
        Lb3:
            if (r12 == 0) goto Lbd
            r9.add(r12)
            goto Lbd
        Lb9:
            r16 = r4
            r17 = r5
        Lbd:
            int r10 = r10 + 1
            r4 = r16
            r5 = r17
            goto L19
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzi.b(android.os.Parcelable[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] c(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dzi dziVar = (dzi) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = dziVar.a;
            if (charSequence != null) {
                bundle.putCharSequence(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, charSequence);
            }
            bundle.putLong("time", dziVar.b);
            dzv dzvVar = dziVar.c;
            if (dzvVar != null) {
                bundle.putCharSequence("sender", dzvVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", dyf.b(dziVar.c));
                } else {
                    bundle.putBundle("person", dziVar.c.a());
                }
            }
            String str = dziVar.e;
            if (str != null) {
                bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
            }
            Uri uri = dziVar.f;
            if (uri != null) {
                bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            }
            bundle.putBundle("extras", dziVar.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Notification.MessagingStyle.Message a() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        dzv dzvVar = this.c;
        CharSequence charSequence = null;
        Person person = null;
        if (i >= 28) {
            CharSequence charSequence2 = this.a;
            long j = this.b;
            if (dzvVar != null) {
                person = dyf.b(dzvVar);
            }
            a = dzh.a(charSequence2, j, person);
        } else {
            CharSequence charSequence3 = this.a;
            long j2 = this.b;
            if (dzvVar != null) {
                charSequence = dzvVar.a;
            }
            a = dzg.a(charSequence3, j2, charSequence);
        }
        String str = this.e;
        if (str != null) {
            dzg.b(a, str, this.f);
        }
        return a;
    }

    public final void d(String str, Uri uri) {
        this.e = str;
        this.f = uri;
    }
}
