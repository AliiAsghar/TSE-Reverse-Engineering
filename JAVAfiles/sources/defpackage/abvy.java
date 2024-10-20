package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvy extends abwc {
    final /* synthetic */ Map a;
    final /* synthetic */ addy b;
    final /* synthetic */ ahjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvy(addy addyVar, String str, Map map, ahjj ahjjVar) {
        super(str, null);
        this.a = map;
        this.c = ahjjVar;
        this.b = addyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.abwc
    protected final void a(abwb abwbVar) {
        ((Handler) this.b.b).removeCallbacksAndMessages(this);
        addy addyVar = this.b;
        abvz abvzVar = new abvz((Context) addyVar.a, abwbVar, (Handler) addyVar.b, this.a, this.e, this.g, (abwd) addyVar.c, this.c);
        long a = ((DroidGuardResultsRequest) abvzVar.e).a();
        ((Handler) abvzVar.c).postAtTime(new maa(abvzVar, a, abvzVar, 9), abvzVar, a + SystemClock.uptimeMillis());
        abwb abwbVar2 = (abwb) abvzVar.g;
        String a2 = abwbVar2.a(abvzVar.d);
        abwbVar2.close();
        ((Handler) abvzVar.c).removeCallbacksAndMessages(abvzVar);
        abvzVar.a(a2);
    }
}
