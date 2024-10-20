package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsv implements ahss {
    public static ahsv a;
    public final Context b;
    private final ContentObserver c;

    public ahsv() {
        this.b = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        Context context;
        synchronized (ahsv.class) {
            ahsv ahsvVar = a;
            if (ahsvVar != null && (context = ahsvVar.b) != null && ahsvVar.c != null) {
                context.getContentResolver().unregisterContentObserver(a.c);
            }
            a = null;
        }
    }

    @Override // defpackage.ahss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.b;
        if (context != null && !agqa.d(context)) {
            try {
                return (String) ahof.d(new ahsr() { // from class: ahst
                    @Override // defpackage.ahsr
                    public final Object a() {
                        return acmd.c(ahsv.this.b.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public ahsv(Context context) {
        this.b = context;
        ahsu ahsuVar = new ahsu();
        this.c = ahsuVar;
        context.getContentResolver().registerContentObserver(acme.a, true, ahsuVar);
    }
}
