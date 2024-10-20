package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;

/* renamed from: j$.nio.file.attribute.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0059i implements InterfaceC0055e {
    public final /* synthetic */ DosFileAttributeView a;

    private /* synthetic */ C0059i(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    public static /* synthetic */ C0059i c(DosFileAttributeView dosFileAttributeView) {
        if (dosFileAttributeView == null) {
            return null;
        }
        return new C0059i(dosFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0059i) {
            obj = ((C0059i) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final /* synthetic */ InterfaceC0058h readAttributes() {
        BasicFileAttributes readAttributes;
        readAttributes = this.a.readAttributes();
        return C0056f.a(readAttributes);
    }
}
