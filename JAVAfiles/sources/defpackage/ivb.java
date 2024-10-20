package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivb implements Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivb(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                alvi alviVar = ixd.a;
                ((ComposeMessageView) obj).E().D(this.a);
                return;
            case 1:
                utz utzVar = itb.a;
                ((View) obj).animate().alpha(1.0f).setDuration(this.a).start();
                return;
            case 2:
                xyo a = vbu.a.a();
                a.H("Updating subscription map with: ");
                a.j((String) obj);
                a.H(" for subscription: ");
                a.F(this.a);
                a.q();
                return;
            case 3:
                aozy aozyVar = (aozy) obj;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                int i = this.a;
                amkv amkvVar = (amkv) aozyVar.b;
                amkv amkvVar2 = amkv.a;
                amkvVar.b |= 256;
                amkvVar.k = i;
                return;
            case 4:
                aozy aozyVar2 = (aozy) obj;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                int i2 = this.a;
                amkv amkvVar3 = (amkv) aozyVar2.b;
                amkv amkvVar4 = amkv.a;
                amkvVar3.b |= 256;
                amkvVar3.k = i2;
                return;
            case 5:
                aozy aozyVar3 = (aozy) obj;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                int i3 = this.a;
                amkv amkvVar5 = (amkv) aozyVar3.b;
                amkv amkvVar6 = amkv.a;
                amkvVar5.b |= 256;
                amkvVar5.k = i3;
                return;
            case 6:
                aozy aozyVar4 = (aozy) obj;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                int i4 = this.a;
                amkv amkvVar7 = (amkv) aozyVar4.b;
                amkv amkvVar8 = amkv.a;
                amkvVar7.b |= 256;
                amkvVar7.k = i4;
                return;
            default:
                int i5 = this.a;
                ((View) obj).setPadding(i5, 0, i5, 0);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
