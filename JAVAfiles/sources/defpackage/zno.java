package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class zno {
    public String a;
    private final znn b;

    public zno(String str, znn znnVar) {
        this.a = str;
        this.b = znnVar;
    }

    public static zno a(String str) {
        return new zno(str, new znn() { // from class: znm
            @Override // defpackage.znn
            public final void a(String str2) {
            }
        });
    }

    public final void b(String str) {
        this.a = str;
        this.b.a(str);
    }
}
