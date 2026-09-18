Patrones de Software
1. Builder

Ubicación: Clase Builder en Main.java.

Uso: Se utiliza para crear las pólizas paso a paso. Así podemos colocar los datos de la póliza y al final crear el objeto Policy.

2. Abstract Factory

Ubicación: Clase Factory en Main.java.

Uso: Se utiliza para crear el certificado dependiendo del tipo de seguro.

SEQUIA → CERT-SEQ
HELADA → CERT-HEL
EXCESO_LLUVIA → CERT-EXC

De esta forma cada producto tiene su certificado correspondiente.

3. Factory Method

Ubicación: Clase Sales en Main.java.

Uso: Se utiliza para crear el número del comprobante dependiendo del canal de venta.

COOPERATIVA
APP_MOVIL
CORRESPONSAL

Cada canal tiene su propio número de comprobante y su comisión.

Conclusión

Los tres patrones ayudan a organizar el programa. Builder crea las pólizas, Abstract Factory crea los certificados y Factory Method maneja los comprobantes de venta.

Los tres patrones ayudan a organizar el programa. Builder crea las pólizas, Factory crea los certificados y Sales maneja los comprobantes de venta.
