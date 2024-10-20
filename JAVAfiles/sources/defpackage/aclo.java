package defpackage;

import com.google.android.gms.wearable.internal.AbstractWearableCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aclo extends AbstractWearableCallbacks {
    private abrz a;

    public aclo(abrz abrzVar) {
        this.a = abrzVar;
    }

    public final void a(Object obj) {
        abrz abrzVar = this.a;
        if (abrzVar != null) {
            abrzVar.c(obj);
            this.a = null;
        }
    }
}
