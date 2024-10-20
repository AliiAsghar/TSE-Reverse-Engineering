package defpackage;

import android.os.AsyncTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugb extends AsyncTask {
    private final alhr a;
    private final algk b;

    public ugb(alhr alhrVar, algk algkVar) {
        this.a = akto.b(alhrVar);
        this.b = akto.a(algkVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return (atkn) this.a.get();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}
