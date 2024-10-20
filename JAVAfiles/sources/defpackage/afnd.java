package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnd extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final StringBuilder get() {
        Object obj = super.get();
        obj.getClass();
        StringBuilder sb = (StringBuilder) obj;
        sb.setLength(0);
        return sb;
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new StringBuilder();
    }
}
