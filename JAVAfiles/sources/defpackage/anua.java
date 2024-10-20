package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anua implements anuf {
    public final String a;
    public final aocj b;
    public final aozb c;
    public final anxp d;
    public final Integer e;
    public final int f;

    private anua(String str, aocj aocjVar, aozb aozbVar, int i, anxp anxpVar, Integer num) {
        this.a = str;
        this.b = aocjVar;
        this.c = aozbVar;
        this.f = i;
        this.d = anxpVar;
        this.e = num;
    }

    public static anua a(String str, aozb aozbVar, int i, anxp anxpVar, Integer num) {
        if (anxpVar == anxp.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new anua(str, anuk.a(str), aozbVar, i, anxpVar, num);
    }
}
