## TASK KILLER
### README

-METODO GET:

Para ver todas las tareas creadas:

//http://localhost:8081/api/tasks/

Para ver una tarea por id:

//http://localhost:8081/api/tasks/{id}

Para ver una lista por id:

//http://localhost:8081/api/tasks/list/{id}/task

-METODO PUT:

Hace un update de una tarea existende por id:

/{id}

Cambia el boolean done de la tarea existente por id a true:

/{id}/done

Actualiza contenido de dentro de la tarea existente:

/{id}/content

-DELETE:

Se hace delete de la tarea por id:
/{id}



