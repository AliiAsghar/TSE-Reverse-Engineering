package defpackage;

import android.content.Intent;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.messaging.welcome.WelcomeFlowActivityWithoutConfigChanges;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfe {
    public static final alwo a = alwo.o("BugleWelcome");
    public final WelcomeFlowActivityWithoutConfigChanges b;
    public final arwe c;
    public final arwe d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final AtomicBoolean j;
    private final arml k;
    private final arml l;

    public abfe(WelcomeFlowActivityWithoutConfigChanges welcomeFlowActivityWithoutConfigChanges, arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.b = welcomeFlowActivityWithoutConfigChanges;
        this.c = arweVar;
        this.d = arweVar2;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = new AtomicBoolean();
        this.k = armd.a(new abcv(this, 6));
        this.l = armd.a(new abcv(this, 5));
    }

    public final ViewPager2 a() {
        Object a2 = this.k.a();
        a2.getClass();
        return (ViewPager2) a2;
    }

    public final abfj b() {
        Object a2 = this.l.a();
        a2.getClass();
        return (abfj) a2;
    }

    public final void c(int i) {
        Intent intent = this.b.getIntent();
        intent.putExtra("welcome_flow_result", i);
        this.b.setResult(-1, intent);
        this.b.finish();
    }
}
