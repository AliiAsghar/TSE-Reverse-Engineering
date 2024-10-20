package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import defpackage.dhv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dad implements dcf {
    private final ClipboardManager a;

    public dad(ClipboardManager clipboardManager) {
        this.a = clipboardManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00f7, code lost:
    
        if (r3 == 2) goto L60;
     */
    @Override // defpackage.dcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dhv a() {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.a():dhv");
    }

    @Override // defpackage.dcf
    public final void b(dce dceVar) {
        this.a.setPrimaryClip(dceVar.a);
    }

    @Override // defpackage.dcf
    public final void c(dhv dhvVar) {
        CharSequence charSequence;
        byte b;
        if (dhvVar.d().isEmpty()) {
            charSequence = dhvVar.b;
        } else {
            SpannableString spannableString = new SpannableString(dhvVar.b);
            dcr dcrVar = new dcr();
            List d = dhvVar.d();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                dhv.c cVar = (dhv.c) d.get(i);
                dip dipVar = (dip) cVar.a;
                int i2 = cVar.b;
                int i3 = cVar.c;
                dcrVar.a.recycle();
                dcrVar.a = Parcel.obtain();
                byte b2 = 1;
                if (!a.bB(dipVar.b(), cku.h)) {
                    dcrVar.a((byte) 1);
                    dcrVar.e(dipVar.b());
                }
                if (!a.bB(dipVar.b, drm.a)) {
                    dcrVar.a((byte) 2);
                    dcrVar.d(dipVar.b);
                }
                dlx dlxVar = dipVar.c;
                if (dlxVar != null) {
                    dcrVar.a((byte) 3);
                    dcrVar.c(dlxVar.h);
                }
                dls dlsVar = dipVar.d;
                if (dlsVar != null) {
                    dcrVar.a((byte) 4);
                    int i4 = dlsVar.a;
                    if (a.bA(i4, 0) || !a.bA(i4, 1)) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                    dcrVar.a(b);
                }
                dlt dltVar = dipVar.e;
                if (dltVar != null) {
                    dcrVar.a((byte) 5);
                    int i5 = dltVar.a;
                    if (!a.bA(i5, 0)) {
                        if (!a.bA(i5, 65535)) {
                            if (a.bA(i5, 1)) {
                                b2 = 2;
                            } else if (a.bA(i5, 2)) {
                                b2 = 3;
                            }
                        }
                        dcrVar.a(b2);
                    }
                    b2 = 0;
                    dcrVar.a(b2);
                }
                String str = dipVar.g;
                if (str != null) {
                    dcrVar.a((byte) 6);
                    dcrVar.a.writeString(str);
                }
                if (!a.bB(dipVar.h, drm.a)) {
                    dcrVar.a((byte) 7);
                    dcrVar.d(dipVar.h);
                }
                dqa dqaVar = dipVar.i;
                if (dqaVar != null) {
                    dcrVar.a((byte) 8);
                    dcrVar.b(dqaVar.a);
                }
                dqn dqnVar = dipVar.j;
                if (dqnVar != null) {
                    dcrVar.a((byte) 9);
                    dcrVar.b(dqnVar.b);
                    dcrVar.b(dqnVar.c);
                }
                if (!a.bB(dipVar.l, cku.h)) {
                    dcrVar.a((byte) 10);
                    dcrVar.e(dipVar.l);
                }
                dqj dqjVar = dipVar.m;
                if (dqjVar != null) {
                    dcrVar.a((byte) 11);
                    dcrVar.c(dqjVar.d);
                }
                cma cmaVar = dipVar.n;
                if (cmaVar != null) {
                    dcrVar.a((byte) 12);
                    dcrVar.e(cmaVar.b);
                    dcrVar.b(Float.intBitsToFloat((int) (cmaVar.c >> 32)));
                    dcrVar.b(Float.intBitsToFloat((int) (cmaVar.c & 4294967295L)));
                    dcrVar.b(cmaVar.d);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(dcrVar.a.marshall(), 0)), i2, i3, 33);
            }
            charSequence = spannableString;
        }
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    @Override // defpackage.dcf
    public final boolean d() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
