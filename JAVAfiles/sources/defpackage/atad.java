package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atad implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public transient int b;
    private transient atap c;
    private final int d;
    private final List e;
    private int f;
    private atba g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;

    public atad(atad atadVar) {
        this.c = new atap(atadVar.c.a);
        this.d = atadVar.d;
        this.f = atadVar.f;
        this.g = atadVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(atadVar.h);
        this.i = new TreeMap();
        for (Integer num : atadVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) atadVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(atadVar.j);
        this.e = new ArrayList();
        Iterator it = atadVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ataf) it.next()).clone());
        }
        this.k = new TreeMap(atadVar.k);
        this.a = atadVar.a;
        this.b = atadVar.b;
        this.l = atadVar.l;
    }

    private final void a(byte[] bArr, byte[] bArr2, atao ataoVar) {
        atan atanVar = new atan(null);
        atanVar.e = ataoVar.d;
        atanVar.f = ataoVar.e;
        atam atamVar = new atam(atanVar);
        ataj atajVar = new ataj();
        atajVar.e = ataoVar.d;
        atajVar.f = ataoVar.e;
        atak atakVar = new atak(atajVar);
        for (int i = 0; i < (1 << this.d); i++) {
            atan atanVar2 = new atan();
            atanVar2.e = ataoVar.d;
            atanVar2.f = ataoVar.e;
            atanVar2.a = i;
            atanVar2.b = ataoVar.b;
            atanVar2.c = ataoVar.c;
            atanVar2.g = ataoVar.f;
            ataoVar = new atao(atanVar2);
            atap atapVar = this.c;
            atapVar.a(atapVar.b(bArr2, ataoVar), bArr);
            atoi c = this.c.c(ataoVar);
            atan atanVar3 = new atan(null);
            atanVar3.e = atamVar.d;
            atanVar3.f = atamVar.e;
            atanVar3.b = i;
            atanVar3.c = atamVar.b;
            atanVar3.a = atamVar.c;
            atanVar3.g = atamVar.f;
            atamVar = new atam(atanVar3);
            atba at = atow.at(this.c, c, atamVar);
            ataj atajVar2 = new ataj();
            atajVar2.e = atakVar.d;
            atajVar2.f = atakVar.e;
            atajVar2.b = i;
            atajVar2.g = atakVar.f;
            atakVar = new atak(atajVar2);
            while (!this.j.isEmpty()) {
                int i2 = ((atba) this.j.peek()).a;
                int i3 = at.a;
                if (i2 == i3) {
                    int i4 = i / (1 << i3);
                    if (i4 == 1) {
                        this.h.add(at);
                        i4 = 1;
                    }
                    if (i4 == 3) {
                        int i5 = at.a;
                        if (i5 < this.d - this.f) {
                            ataf atafVar = (ataf) this.e.get(i5);
                            atafVar.a = at;
                            int i6 = at.a;
                            atafVar.c = i6;
                            if (i6 == atafVar.b) {
                                atafVar.f = true;
                            }
                        }
                        i4 = 3;
                    }
                    if (i4 >= 3 && (i4 & 1) == 1) {
                        int i7 = at.a;
                        int i8 = this.d;
                        if (i7 >= i8 - this.f && i7 <= i8 - 2) {
                            if (this.i.get(Integer.valueOf(i7)) == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(at);
                                this.i.put(Integer.valueOf(at.a), linkedList);
                            } else {
                                ((LinkedList) this.i.get(Integer.valueOf(at.a))).add(at);
                            }
                        }
                    }
                    ataj atajVar3 = new ataj();
                    atajVar3.e = atakVar.d;
                    atajVar3.f = atakVar.e;
                    atajVar3.a = atakVar.a;
                    atajVar3.b = (atakVar.b - 1) / 2;
                    atajVar3.g = atakVar.f;
                    atak atakVar2 = new atak(atajVar3);
                    atba aq = atow.aq(this.c, (atba) this.j.pop(), at, atakVar2);
                    atba atbaVar = new atba(aq.a + 1, aq.a());
                    ataj atajVar4 = new ataj();
                    atajVar4.e = atakVar2.d;
                    atajVar4.f = atakVar2.e;
                    atajVar4.a = atakVar2.a + 1;
                    atajVar4.b = atakVar2.b;
                    atajVar4.g = atakVar2.f;
                    atakVar = new atak(atajVar4);
                    at = atbaVar;
                }
            }
            this.j.push(at);
        }
        this.g = (atba) this.j.pop();
    }

    private final void b(byte[] bArr, byte[] bArr2, atao ataoVar) {
        if (!this.l) {
            int i = this.a;
            if (i <= this.b - 1) {
                int i2 = this.d;
                int i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        if (((i >> i3) & 1) == 0) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = 0;
                        break;
                    }
                }
                if (((this.a >> (i3 + 1)) & 1) == 0 && i3 < this.d - 1) {
                    this.k.put(Integer.valueOf(i3), (atba) this.h.get(i3));
                }
                atan atanVar = new atan(null);
                atanVar.e = ataoVar.d;
                atanVar.f = ataoVar.e;
                atam atamVar = new atam(atanVar);
                ataj atajVar = new ataj();
                atajVar.e = ataoVar.d;
                atajVar.f = ataoVar.e;
                atak atakVar = new atak(atajVar);
                if (i3 == 0) {
                    atan atanVar2 = new atan();
                    atanVar2.e = ataoVar.d;
                    atanVar2.f = ataoVar.e;
                    atanVar2.a = this.a;
                    atanVar2.b = ataoVar.b;
                    atanVar2.c = ataoVar.c;
                    atanVar2.g = ataoVar.f;
                    ataoVar = new atao(atanVar2);
                    atap atapVar = this.c;
                    atapVar.a(atapVar.b(bArr2, ataoVar), bArr);
                    atoi c = this.c.c(ataoVar);
                    atan atanVar3 = new atan(null);
                    atanVar3.e = atamVar.d;
                    atanVar3.f = atamVar.e;
                    atanVar3.b = this.a;
                    atanVar3.c = atamVar.b;
                    atanVar3.a = atamVar.c;
                    atanVar3.g = atamVar.f;
                    this.h.set(0, atow.at(this.c, c, new atam(atanVar3)));
                } else {
                    ataj atajVar2 = new ataj();
                    atajVar2.e = atakVar.d;
                    atajVar2.f = atakVar.e;
                    int i4 = i3 - 1;
                    atajVar2.a = i4;
                    atajVar2.b = this.a >> i3;
                    atajVar2.g = atakVar.f;
                    atak atakVar2 = new atak(atajVar2);
                    atap atapVar2 = this.c;
                    atapVar2.a(atapVar2.b(bArr2, ataoVar), bArr);
                    atap atapVar3 = this.c;
                    atba atbaVar = (atba) this.h.get(i4);
                    Map map = this.k;
                    Integer valueOf = Integer.valueOf(i4);
                    atba aq = atow.aq(atapVar3, atbaVar, (atba) map.get(valueOf), atakVar2);
                    this.h.set(i3, new atba(aq.a + 1, aq.a()));
                    this.k.remove(valueOf);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (i5 < this.d - this.f) {
                            this.h.set(i5, ((ataf) this.e.get(i5)).a);
                        } else {
                            this.h.set(i5, (atba) ((LinkedList) this.i.get(Integer.valueOf(i5))).removeFirst());
                        }
                    }
                    int min = Math.min(i3, this.d - this.f);
                    for (int i6 = 0; i6 < min; i6++) {
                        int i7 = this.a + 1 + ((1 << i6) * 3);
                        if (i7 < (1 << this.d)) {
                            ataf atafVar = (ataf) this.e.get(i6);
                            atafVar.a = null;
                            atafVar.c = atafVar.b;
                            atafVar.d = i7;
                            atafVar.e = true;
                            atafVar.f = false;
                        }
                    }
                }
                for (int i8 = 0; i8 < ((this.d - this.f) >> 1); i8++) {
                    ataf atafVar2 = null;
                    for (ataf atafVar3 : this.e) {
                        if (!atafVar3.f && atafVar3.e && (atafVar2 == null || atafVar3.a() < atafVar2.a() || (atafVar3.a() == atafVar2.a() && atafVar3.d < atafVar2.d))) {
                            atafVar2 = atafVar3;
                        }
                    }
                    if (atafVar2 != null) {
                        Stack stack = this.j;
                        atap atapVar4 = this.c;
                        if (!atafVar2.f && atafVar2.e) {
                            atan atanVar4 = new atan();
                            atanVar4.e = ataoVar.d;
                            atanVar4.f = ataoVar.e;
                            int i9 = atafVar2.d;
                            atanVar4.a = i9;
                            atanVar4.b = ataoVar.b;
                            atanVar4.c = ataoVar.c;
                            atanVar4.g = ataoVar.f;
                            atao ataoVar2 = new atao(atanVar4);
                            atan atanVar5 = new atan(null);
                            atanVar5.e = ataoVar2.d;
                            atanVar5.f = ataoVar2.e;
                            atanVar5.b = i9;
                            atam atamVar2 = new atam(atanVar5);
                            ataj atajVar3 = new ataj();
                            atajVar3.e = ataoVar2.d;
                            atajVar3.f = ataoVar2.e;
                            atajVar3.b = i9;
                            atak atakVar3 = new atak(atajVar3);
                            atapVar4.a(atapVar4.b(bArr2, ataoVar2), bArr);
                            atba at = atow.at(atapVar4, atapVar4.c(ataoVar2), atamVar2);
                            while (!stack.isEmpty() && ((atba) stack.peek()).a == at.a && ((atba) stack.peek()).a != atafVar2.b) {
                                ataj atajVar4 = new ataj();
                                atajVar4.e = atakVar3.d;
                                atajVar4.f = atakVar3.e;
                                atajVar4.a = atakVar3.a;
                                atajVar4.b = (atakVar3.b - 1) / 2;
                                atajVar4.g = atakVar3.f;
                                atak atakVar4 = new atak(atajVar4);
                                atba aq2 = atow.aq(atapVar4, (atba) stack.pop(), at, atakVar4);
                                atba atbaVar2 = new atba(aq2.a + 1, aq2.a());
                                ataj atajVar5 = new ataj();
                                atajVar5.e = atakVar4.d;
                                atajVar5.f = atakVar4.e;
                                atajVar5.a = atakVar4.a + 1;
                                atajVar5.b = atakVar4.b;
                                atajVar5.g = atakVar4.f;
                                atakVar3 = new atak(atajVar5);
                                at = atbaVar2;
                            }
                            atba atbaVar3 = atafVar2.a;
                            if (atbaVar3 == null) {
                                atafVar2.a = at;
                            } else {
                                if (atbaVar3.a == at.a) {
                                    ataj atajVar6 = new ataj();
                                    atajVar6.e = atakVar3.d;
                                    atajVar6.f = atakVar3.e;
                                    atajVar6.a = atakVar3.a;
                                    atajVar6.b = (atakVar3.b - 1) / 2;
                                    atajVar6.g = atakVar3.f;
                                    atak atakVar5 = new atak(atajVar6);
                                    at = new atba(atafVar2.a.a + 1, atow.aq(atapVar4, atbaVar3, at, atakVar5).a());
                                    atafVar2.a = at;
                                    ataj atajVar7 = new ataj();
                                    atajVar7.e = atakVar5.d;
                                    atajVar7.f = atakVar5.e;
                                    atajVar7.a = atakVar5.a + 1;
                                    atajVar7.b = atakVar5.b;
                                    atajVar7.g = atakVar5.f;
                                } else {
                                    stack.push(at);
                                }
                            }
                            if (atafVar2.a.a == atafVar2.b) {
                                atafVar2.f = true;
                            } else {
                                atafVar2.c = at.a;
                                atafVar2.d++;
                            }
                        } else {
                            throw new IllegalStateException("finished or not initialized");
                        }
                    }
                }
                this.a++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        }
        throw new IllegalStateException("index already used");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            i = objectInputStream.readInt();
            this.b = i;
        } else {
            i = (1 << this.d) - 1;
            this.b = i;
        }
        if (i <= (1 << this.d) - 1 && this.a <= i + 1 && objectInputStream.available() == 0) {
        } else {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b);
    }

    public atad(atad atadVar, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.c = new atap(new atar(aSN1ObjectIdentifier));
        this.d = atadVar.d;
        this.f = atadVar.f;
        this.g = atadVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(atadVar.h);
        this.i = new TreeMap();
        for (Integer num : atadVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) atadVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(atadVar.j);
        this.e = new ArrayList();
        Iterator it = atadVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ataf) it.next()).clone());
        }
        this.k = new TreeMap(atadVar.k);
        int i = atadVar.a;
        this.a = i;
        this.b = atadVar.b;
        this.l = atadVar.l;
        if (this.h != null) {
            if (this.i != null) {
                if (this.j != null) {
                    if (!atow.aj(this.d, i)) {
                        throw new IllegalStateException("index in BDS state out of bounds");
                    }
                    return;
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    public atad(atad atadVar, byte[] bArr, byte[] bArr2, atao ataoVar) {
        this.c = new atap(atadVar.c.a);
        this.d = atadVar.d;
        this.f = atadVar.f;
        this.g = atadVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(atadVar.h);
        this.i = new TreeMap();
        for (Integer num : atadVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) atadVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(atadVar.j);
        this.e = new ArrayList();
        Iterator it = atadVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ataf) it.next()).clone());
        }
        this.k = new TreeMap(atadVar.k);
        this.a = atadVar.a;
        this.b = atadVar.b;
        this.l = false;
        b(bArr, bArr2, ataoVar);
    }

    private atad(atap atapVar, int i, int i2, int i3) {
        this.c = atapVar;
        this.d = i;
        this.b = i3;
        this.f = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.h = new ArrayList();
                this.i = new TreeMap();
                this.j = new Stack();
                this.e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.e.add(new ataf(i5));
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public atad(atbc atbcVar, int i, int i2) {
        this(atbcVar.a(), atbcVar.c, atbcVar.d, i2);
        this.b = i;
        this.a = i2;
        this.l = true;
    }

    public atad(atbc atbcVar, byte[] bArr, byte[] bArr2, atao ataoVar) {
        this(atbcVar.a(), atbcVar.c, atbcVar.d, (1 << r1) - 1);
        a(bArr, bArr2, ataoVar);
    }

    public atad(atbc atbcVar, byte[] bArr, byte[] bArr2, atao ataoVar, int i) {
        this(atbcVar.a(), atbcVar.c, atbcVar.d, (1 << r1) - 1);
        a(bArr, bArr2, ataoVar);
        while (this.a < i) {
            b(bArr, bArr2, ataoVar);
            this.l = false;
        }
    }
}
