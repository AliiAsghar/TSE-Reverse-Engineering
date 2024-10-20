package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjh implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        hji hjiVar = (hji) obj;
        hji hjiVar2 = (hji) obj2;
        return almj.b.b(hjiVar.getPref(), hjiVar2.getPref()).b(hjiVar.getAppearanceOrder(), hjiVar2.getAppearanceOrder()).a();
    }
}
