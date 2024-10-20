package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0240v extends C0103m implements java.util.Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !this.a.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }
}
