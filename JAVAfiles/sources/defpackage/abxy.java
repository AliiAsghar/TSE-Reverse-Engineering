package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxy implements abyd {
    private final /* synthetic */ int a;

    public abxy(int i) {
        this.a = i;
    }

    @Override // defpackage.abyd
    public final abyc a(Context context, String str, abyb abybVar) {
        int b;
        int i = -1;
        if (this.a != 0) {
            abyc abycVar = new abyc();
            int b2 = abybVar.b(context, str, true);
            abycVar.b = b2;
            if (b2 != 0) {
                abycVar.c = 1;
            } else {
                int a = abybVar.a(context, str);
                abycVar.a = a;
                if (a != 0) {
                    abycVar.c = -1;
                }
            }
            return abycVar;
        }
        abyc abycVar2 = new abyc();
        int a2 = abybVar.a(context, str);
        abycVar2.a = a2;
        int i2 = 0;
        if (a2 != 0) {
            b = abybVar.b(context, str, false);
            abycVar2.b = b;
        } else {
            b = abybVar.b(context, str, true);
            abycVar2.b = b;
        }
        int i3 = abycVar2.a;
        if (i3 == 0) {
            if (b == 0) {
                i = 0;
                abycVar2.c = i;
                return abycVar2;
            }
        } else {
            i2 = i3;
        }
        if (i2 < b) {
            i = 1;
        }
        abycVar2.c = i;
        return abycVar2;
    }
}
